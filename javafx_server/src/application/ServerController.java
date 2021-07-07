package application;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class ServerController implements Initializable {
	
	// ������Ǯ ��� 
		// �ܺηκ��� �뷮�� ��û�� ���� �Ű� �ϳ��� ó�� 
	public static ExecutorService threadpool;
		// ������Ǯ ���� Ŭ���� : ExecutorService
	
	// ���ӵ� Ŭ���̾�Ʈ �����ϱ� ���� ����Ʈ  [ ����ȭ ����� �ִ� vector ] 
		// ����ȭ : ���� �����尡 ������ �޼ҵ� ȣ��� �浹 ���� [ �޼ҵ忡 ������ ȣ�� ���� ]
	public static Vector<Client> clients = new Vector<>();
	
	ServerSocket serverSocket; // �������� 
	
	// ���� ���� �޼ҵ� [ �������� ���� => ���ѷ���(Ŭ���Ʈ ���� ��ٸ���) ]
	public void serverstart() {
		try {
			// 1. ��������� �޸� �Ҵ� 
			serverSocket = new ServerSocket();
			// 2. ���� ���ε� [ �������� ���� ip , port ] 
			serverSocket.bind( new InetSocketAddress("127.0.0.1" , 1234));
		}
		catch (Exception e) {}
		
		Runnable thread  = new Runnable() {
			@Override
			public void run() {
				try {
					while(true) {
						//1. Ŭ���̾�Ʈ ���� ��û�� �㰡 
						Socket socket = serverSocket.accept();
						//2. �㰡�� Ŭ���̾�Ʈ ����Ʈ�� ��� 
						clients.add( new Client(socket) );
						
					}
				}catch (Exception e) {}
			}
		}; //  ������ end
			// ������ ����� ������Ǯ�� �����ִ� ������ �ʱ�ȭ
		threadpool = Executors.newCachedThreadPool(); 
		threadpool.submit(thread);
	}
	
	// ���� ���� �޼ҵ� [ �������� �ݱ� ] 
	public void serverstop() {
		try {
			// 1. ���� ���ӵ� Ŭ���̾�Ʈ ���� ��� ���� 
			Iterator<  Client > iterator = clients.iterator();
				// Iterator : �÷��������ӿ�ũ�� ��� ��ҵ� �ϳ��� ��ȸ
			while( iterator.hasNext() ) { // .hasNext() : ���� ��Ұ� �ִ��� Ȯ�� 
				Client client = iterator.next(); // .next() : ���� ��� ��������
				client.socket.close(); // ����ó�� �߻�
				iterator.remove();
			}
			// 2. �������� ���� 
			serverSocket.close();
			// 3. ������Ǯ ���� 
			threadpool.shutdown();
			
		}catch (Exception e) {}
	}
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	}
    @FXML
    private TextArea txtserver;

    @FXML
    private Button btnstart;

    @FXML
    void start(ActionEvent event) {
    	
    	if( btnstart.getText().equals("��������") ) { // ��ư�� ���������̸� 
    		// 1. �������� 
    		serverstart();
    		// ���ٽ� ǥ�� [ �ؽ�Ʈâ�� �޽��� �߰� ]
    			// Platform  ��� ��������
    		// Platform.runLater( (�μ�) -> { �����ڵ� } );
    		Platform.runLater( () -> {	
    			String msg = "[��������]\n";	// �޽���â�� ǥ���� ����
    			txtserver.appendText(msg);	// �޽����� textarea �߰�
    			btnstart.setText("��������");	// ��ư�ؽ�Ʈ ���������� ����
    		} );
    	}else { // ��ư�� ���������̸� 
    		// 1. ��������
    		serverstop();
    		Platform.runLater( () -> {
    			String msg = "[��������]\n";	// �޽���â�� ǥ���� ����
    			txtserver.appendText(msg);	// �޽����� textarea �߰�
    			btnstart.setText("��������");	// ��ư�ؽ�Ʈ ��������� ����
    		});
    	}
    }
	
    
    
    
    
    
    
    
    
    
    
    
	

}

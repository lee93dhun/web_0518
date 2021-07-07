package application;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ClientController implements Initializable {
	
	Socket socket ; // ���� ���� 
	
	// Ŭ���̾�Ʈ ���� �޼ҵ� 
	public void clientstart() {
		//1. ���ϻ��� -> 2. ������������ �����û 
		
		//Thread thread = new Thread() { run �޼ҵ� �������̵� };
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					socket = new Socket("127.0.0.1" ,1234);
					receive();
				}
				catch (Exception e) {}
			}
		}; // ������ ��ȣ �� 
		thread.start();			// run�޼ҵ�(��Ƽ������ ����) <---- start(run�޼ҵ�ȣ��)
	}
	// Ŭ���̾�Ʈ ���� �޼ҵ� 
	public void clientstop() {
		try {
			socket.close();
		}catch (Exception e) { }
	}
	
	// �޽��� ���� �޼ҵ� 
	public void send( String msg ) {
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					OutputStream outputStream = socket.getOutputStream();
					byte[] buffer = msg.getBytes(); // ���ڿ� --> ����Ʈ�� 
					outputStream.write(buffer); // ��Ʈ�� �������� 
					outputStream.flush(); // ��Ʈ�� ���빰 �ʱ�ȭ 
				}
				catch (Exception e) {} 
			}
		};
		thread.start();
	}
	
	// �޽��� �޴� �޼ҵ�
	public void receive( ) {
		while(true) {
			try {
				InputStream inputStream = socket.getInputStream();
				byte[] buffer = new byte[1000]; // �迭 ���� 
				inputStream.read(buffer); // �Է½�Ʈ������ ���� �о�� ����Ʈ �迭�� ���� 
				String msg = new String( buffer ); // ����Ʈ => ���ڿ� 	
				//Platform.runLater( (�μ�) -> {�����ڵ� } );
				Platform.runLater( () -> {
					
					txtclient.appendText(msg);
						// TextArea.appendText : �ؽ�Ʈâ�� ���� �߰� 
				});

			}
			catch (Exception e) {}
		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// fxml ó�� �������� �ʱⰪ 
		txtcontents.setDisable(true); // �����ϱ��� �Է�â ���� 
		btnsend.setDisable(true); // �����ϱ��� ���۹�ư ����
	}
	
    @FXML
    private TextArea txtclient;

    @FXML
    private TextField txtcontents;

    @FXML
    private Button btnsend;

    @FXML
    private Button btnconn;

    @FXML
    private TextField txtname;

    @FXML
    void conn(ActionEvent event) {
    	
    	if( btnconn.getText().equals("�����ϱ�") ) { // ��ư�� �����ϱ� �̸� 
    		
    		// 1. Ŭ���̾�Ʈ ����
    		clientstart();
    		Platform.runLater( () -> {
    			txtclient.appendText("[ ä�ù� ���� ] \n");
    		} );
    		// 2. ������ 
    		btnconn.setText("��������");
    		txtcontents.setDisable(false); // �Է�â ��� ���� 
    		btnsend.setDisable(false); // ���۹�ư ��� ���� 
    		txtcontents.requestFocus(); // request : ��û  // Focus : Ŀ����ġ 
    		
    	}else { // ��ư�� ���������̸� 
    		// 1. Ŭ���̾�Ʈ ���� 
    		clientstop();
    		Platform.runLater( () -> {
    			txtclient.appendText("[ ä�ù� ���� ] \n");
    		} );
    		// 2. ������
    		btnconn.setText("�����ϱ�");
    		txtcontents.setDisable(true); // �Է�â ��� �Ұ��� 
    		btnsend.setDisable(true); // ���۹�ư ��� �Ұ��� 
    	}
    }
    @FXML
    void send(ActionEvent event) {
    	send( txtname.getText() + " : " + txtcontents.getText() + "\n" );
    			// ������ �޼ҵ� ( �г��� : �Է�â�� ���빰 ) 
    	// �������� 
    	txtcontents.setText(""); // �Է�â �ʱ�ȭ 
    	txtcontents.requestFocus(); 
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

package application;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
	// ������ ���ӵ� Ŭ���̾�Ʈ 
	
	Socket socket;
	
	public Client( Socket socket) {
		
		this.socket = socket;
		receive();
		
	}
	// �޽��� �޴� �޼ҵ� [ ���ѷ��� ] 
	public void receive() {
		Runnable thread = new Runnable() {
			@Override
			public void run() {
				try {
					while(true) {
						InputStream inputStream = socket.getInputStream(); // ������ �Է½�Ʈ��
						
						byte[] buffer = new byte[1000];// ����Ʈ �迭 ���� 
						inputStream.read( buffer ); // �о���� 
						
						String msg = new String( buffer ); // ����Ʈ => ���ڿ�
						//  ���ӵ� ��� Ŭ���̾𿡰� ���� �޽��� ������ 
						for( Client temp : ServerController.clients ) {
							temp.send(msg); // ��� ����Ʈ�� �ִ� Ŭ���̾𿡰� �޽��� ������ 
						}
					}
				}
				catch (Exception e) {
				}
			}
		};
		// �ش� �����带 ������Ǯ�� �߰�
		ServerController.threadpool.submit(thread);
	}
	// �޽��� ������ �޼ҵ� 
	public void send( String msg ) {
		Runnable thread = new Runnable() {
			@Override
			public void run() {
				
				try {
					OutputStream outputStream = socket.getOutputStream();
					byte[] buffer = msg.getBytes(); // �ش� �޼ҵ�� ����[�μ�] �޽����� ����Ʈ�� ��ȯ 
					
					outputStream.write(buffer);
					outputStream.flush(); // ���� �ʱ�ȭ [ �����Ͱ� ���̴� ��� ���� �ʱ�ȭ�ϱ� ] 
					
				}catch (Exception e) {
					// TODO: handle exception
				}
			}
		}; // ������ end
	
		// �ش� �����带 ������Ǯ�� �����ϱ� 
		ServerController.threadpool.submit(thread);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

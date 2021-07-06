package application;

import java.io.InputStream;
import java.net.Socket;

public class Client {
	// 서버에 접속된 클라이언트 
	
	Socket socket;
	
	public Client( Socket socket) {
		this.socket = socket;
	}
	
	// 메시지 받는 메소드 [ 무한루프 ] 
	public void receive() {
		Runnable thread = new Runnable() {
			@Override
			public void run() {
				try {
					while(true) {
						InputStream inputStream = socket.getInputStream(); // 소켓의 입력스트림
						
						byte[] buffer = new byte[1000];// 바이트 배열 생성 
						inputStream.read( buffer ); // 읽어오기 
						
						String msg = new String( buffer ); // 바이트 => 문자열
						//  접속된 모든 클라이언에게 받은 메시지 보내기 
						for( Client temp : ServerController.clients ) {
							temp.send(msg); // 모든 리스트에 있는 클라이언에게 메시지 보내기 
						}
					}
				}
				catch (Exception e) {
				}
			}
		};
		// 해당 스레드를 스레드풀에 추가
		ServerController.threadpool.submit(thread);
	}
	// 메시지 보내는 메소드 
	public void send( String msg ) {
	
	}
	
	
	
	
	

}

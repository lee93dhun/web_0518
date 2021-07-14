package application;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
	// 서버에 접속된 클라이언트 
	
	Socket socket;
	
	public Client( Socket socket) {
		
		this.socket = socket;
		receive();
		
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
		Runnable thread = new Runnable() {
			@Override
			public void run() {
				
				try {
					OutputStream outputStream = socket.getOutputStream();
					byte[] buffer = msg.getBytes(); // 해당 메소드로 들어온[인수] 메시지를 바이트로 변환 
					
					outputStream.write(buffer);
					outputStream.flush(); // 버퍼 초기화 [ 데이터가 쌓이는 경우 버퍼 초기화하기 ] 
					
				}catch (Exception e) {
					// TODO: handle exception
				}
			}
		}; // 쓰레드 end
	
		// 해당 쓰레드를 스레드풀에 적용하기 
		ServerController.threadpool.submit(thread);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

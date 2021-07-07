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
	
	Socket socket ; // 소켓 선언 
	
	// 클라이언트 시작 메소드 
	public void clientstart() {
		//1. 소켓생성 -> 2. 서버소켓으로 연결요청 
		
		//Thread thread = new Thread() { run 메소드 오버라이딩 };
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					socket = new Socket("127.0.0.1" ,1234);
					receive();
				}
				catch (Exception e) {}
			}
		}; // 쓰레드 괄호 끝 
		thread.start();			// run메소드(멀티스레드 로직) <---- start(run메소드호출)
	}
	// 클라이언트 종료 메소드 
	public void clientstop() {
		try {
			socket.close();
		}catch (Exception e) { }
	}
	
	// 메시지 전송 메소드 
	public void send( String msg ) {
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					OutputStream outputStream = socket.getOutputStream();
					byte[] buffer = msg.getBytes(); // 문자열 --> 바이트열 
					outputStream.write(buffer); // 스트림 내보내기 
					outputStream.flush(); // 스트림 내용물 초기화 
				}
				catch (Exception e) {} 
			}
		};
		thread.start();
	}
	
	// 메시지 받는 메소드
	public void receive( ) {
		while(true) {
			try {
				InputStream inputStream = socket.getInputStream();
				byte[] buffer = new byte[1000]; // 배열 선언 
				inputStream.read(buffer); // 입력스트림으로 부터 읽어온 바이트 배열에 저장 
				String msg = new String( buffer ); // 바이트 => 문자열 	
				//Platform.runLater( (인수) -> {실행코드 } );
				Platform.runLater( () -> {
					
					txtclient.appendText(msg);
						// TextArea.appendText : 텍스트창에 내용 추가 
				});

			}
			catch (Exception e) {}
		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// fxml 처음 열렸을때 초기값 
		txtcontents.setDisable(true); // 접속하기전 입력창 차단 
		btnsend.setDisable(true); // 접속하기전 전송버튼 차단
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
    	
    	if( btnconn.getText().equals("접속하기") ) { // 버튼이 접속하기 이면 
    		
    		// 1. 클라이언트 실행
    		clientstart();
    		Platform.runLater( () -> {
    			txtclient.appendText("[ 채팅방 접속 ] \n");
    		} );
    		// 2. 접속후 
    		btnconn.setText("접속종료");
    		txtcontents.setDisable(false); // 입력창 사용 가능 
    		btnsend.setDisable(false); // 전송버튼 사용 가능 
    		txtcontents.requestFocus(); // request : 요청  // Focus : 커서위치 
    		
    	}else { // 버튼이 접속종료이면 
    		// 1. 클라이언트 종료 
    		clientstop();
    		Platform.runLater( () -> {
    			txtclient.appendText("[ 채팅방 퇴장 ] \n");
    		} );
    		// 2. 종료후
    		btnconn.setText("접속하기");
    		txtcontents.setDisable(true); // 입력창 사용 불가능 
    		btnsend.setDisable(true); // 전송버튼 사용 불가능 
    	}
    }
    @FXML
    void send(ActionEvent event) {
    	send( txtname.getText() + " : " + txtcontents.getText() + "\n" );
    			// 보내기 메소드 ( 닉네임 : 입력창의 내용물 ) 
    	// 보내기후 
    	txtcontents.setText(""); // 입력창 초기화 
    	txtcontents.requestFocus(); 
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

package application;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Vector;
import java.util.concurrent.ExecutorService;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class ServerController implements Initializable {
	
	// 스레드풀 사용 
		// 외부로부터 대량의 요청을 순서 매겨 하나씩 처리 
	public static ExecutorService threadpool;
		// 스레드풀 구현 클래스 : ExecutorService
	
	// 접속된 클라이언트 저장하기 위한 리스트  [ 동기화 기능이 있는 vector ] 
		// 동기화 : 여러 쓰레드가 동일한 메소드 호출시 충돌 제거 [ 메소드에 스레드 호출 제한 ]
	public static Vector<Client> clients = new Vector<>();
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
	}
    @FXML
    private TextArea txtserver;

    @FXML
    private Button btnstart;

    @FXML
    void start(ActionEvent event) {

    }
	
	

}

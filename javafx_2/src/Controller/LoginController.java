package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class LoginController implements Initializable {
	// FXML 제어 하는 클래스 
	
	@Override  // FXML 초기값 
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		loading.setVisible(false); // 이미지 숨기기 	
	}
	
	// 컨트롤들의 객체 가져오기 
	@FXML
    private TextField txtid;

    @FXML
    private PasswordField txtpassword;

    @FXML
    private Button btnlogin;

    @FXML
    private Button btnsigup;

    @FXML
    private Label lblfindid;

    @FXML
    private Label lblfindpassword;

    @FXML
    private ImageView loading;

    @FXML
    void findid(MouseEvent event) {

    }

    @FXML
    void findpassword(MouseEvent event) {

    }

    @FXML
    void login(ActionEvent event) {
    	loading.setVisible(true);
    		// 텍스트상자.getText() : 텍스트에 입력된 데이터 호출
    	if( txtid.getText().equals("qwe") && txtpassword.getText().equals("qwe") ) {
    		System.out.println("로그인 성공");
    	}else {
    		System.out.println("로그인 실패");
    	}
    }
    
    
    
    
    
    
    
    

	
    
    
    
    
    
    
    
    
    
    
    
}

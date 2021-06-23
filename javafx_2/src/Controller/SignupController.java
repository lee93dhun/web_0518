package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.Start;
import domain.FileUtil;
import domain.Member;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class SignupController implements Initializable {
	
    @FXML
    private TextField txtid;

    @FXML
    private PasswordField txtpassword;

    @FXML
    private Button btnsignup;

    @FXML
    private Button btnlogin;

    @FXML
    private PasswordField txtpassword2;

    @FXML
    private TextField txtname;

    @FXML
    private TextField txtemail;
    
    @FXML
    private Label lblerror;

    @FXML
    void login(ActionEvent event) {
    }

    @FXML
    void signup(ActionEvent event) {
    	
    	String id = txtid.getText();
    	String passowrd = txtpassword.getText();
    	String passowrd2 = txtpassword2.getText();
    	String name = txtname.getText();
    	String email = txtemail.getText();
    	
    
    	// 1. 중복아이디 제거 
    	for( Member temp : Start.memberlist ) {
    		if( temp.getId().equals(id) ) {
    			lblerror.setText("가입실패 : 동일한 아이디가 존재합니다 ");									
    			return;
    		}
    	}
    	// 2. 패스워드 , 확인패스워드가 동일하지 않을경우
    	if( !passowrd.equals(passowrd2) ) {
    		lblerror.setText("가입실패 : 패스워드가 서로 다릅니다 ");
    		// ! : 부정 [ 반대 ]
			return;
    	}
    	// 3. email 이 @ 포함되어 있지 않는 경우 
    	if( email.indexOf("@") == -1 ) {
    		lblerror.setText("가입실패 : 이메일 형식이 아닙니다 ");
			return;
    	}
    	lblerror.setText("회원가입 완료 : 가입해주셔서 감사합니다 ");
    	
    	Member temp = new Member(id, passowrd, name, email);
    	Start.memberlist.add(temp);
    	// 파일 처리 [ 리스트 => 파일 ] 
    		FileUtil.writefile("C:/Users/User/git/web_0518/javafx_2/src/File/", "memberlist.txt",  Start.memberlist );
			// 메세지 창 띄우기 
    			Alert alert = new Alert( AlertType.INFORMATION);
    			alert.setContentText(" 가입해주셔서 감사합니다 ");
 				alert.setHeaderText("회원가입 성공");
    			alert.showAndWait(); // 확인 버튼 누르기전까지 대기상태 
    	// 스테이지 끄기 
    		btnsignup.getScene().getWindow().hide();
    }
   
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

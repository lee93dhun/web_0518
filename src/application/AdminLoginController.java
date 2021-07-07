package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AdminLoginController implements Initializable{
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
		
	}
	
	@FXML
    private TextField txtid;

    @FXML
    private PasswordField txtpw;

    @FXML
    private Button btnlogin;

    @FXML
    void login(ActionEvent event) {
    	
    	if( txtid.getText().equals("admin01") && txtpw.getText().equals("1111") ) {		// text field에 입력한 로그인 정보가 다음과 같을때
    		
    		btnlogin.getScene().getWindow().hide();		// login stage hide
    		
    		try {	// 로그인 성공시 관리자 메뉴 stage open
	    		Stage stage = new Stage();
	    		Parent parent = FXMLLoader.load(getClass().getResource("/application/AdminHome.fxml") );
	    		Scene scene = new Scene(parent);
	    		stage.setScene(scene);
	    		stage.setResizable(false);		
	    		stage.setTitle("관리자 메뉴");
	    		stage.show();
    		}
    		catch (Exception e) { }
    		
    	}else {			// 로그인 실패시 메시지창 띄우기
    		System.out.println("로그인 실패");
    		Alert alert = new Alert(AlertType.WARNING);
    		alert.setContentText("아이디 혹은 비밀번호가 다릅니다.");
    		alert.setHeaderText("관리자 로그인 실패");
    		alert.showAndWait();
    	}

    }

}

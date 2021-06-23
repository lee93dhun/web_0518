package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.Start;
import domain.Member;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FindidController implements Initializable {
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	
    @FXML
    private Button btnfindid;

    @FXML
    private Button btnlogin;

    @FXML
    private TextField txtname;

    @FXML
    private TextField txtemail;

    @FXML
    private Label lblerror;

    @FXML
    void findid(ActionEvent event) {
    	
    	String name = txtname.getText();
    	String email = txtemail.getText();
    	
    	for( Member temp : Start.memberlist ) {
    		if( temp.getName().equals(name) && temp.getEmail().equals(email) ) {
    			lblerror.setText("찾으신 아이디를 이메일로 전송했습니다");
    			String id = temp.getId();

    			return;
    		}
    	}
    	
    	lblerror.setText("동일한 정보의 회원 아이디가 없습니다");
 
    }

    @FXML
    void login(ActionEvent event) {

    }
	
	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}

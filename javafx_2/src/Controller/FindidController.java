package Controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import DAO.MemberDao;
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
    	
       	// 1. DAO ��ü ���� 
    	MemberDao memberDao = MemberDao.getMemberDao();
    	
    	// 2. ��� ȸ���� �������� 
    	ArrayList<Member> members = memberDao.allmember();
    	
    	for( Member temp : members ) {
    		if( temp.getName().equals(name) && temp.getEmail().equals(email) ) {
    			lblerror.setText("ã���� ���̵� �̸��Ϸ� �����߽��ϴ�");
    			String id = temp.getId();
    			
    			// �������� �޼ҵ� ȣ�� [ �޴»���̸��� , Ÿ�� , ���뿡 ������ ] 
    			temp.emailsend(email, 2, id);
    			return;
    		}
    	}
    	
    	lblerror.setText("������ ������ ȸ�� ���̵� �����ϴ�");
 
    }

    @FXML
    void login(ActionEvent event) {

    }
	
	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}

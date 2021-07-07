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

public class FindpasswordController implements Initializable {
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
	}

    @FXML
    private Button btnfindpassword;

    @FXML
    private Button btnlogin;

    @FXML
    private TextField txtid;

    @FXML
    private TextField txtemail;

    @FXML
    private Label lblerror;

    @FXML
    void findpassword(ActionEvent event) {
    	
    	String id = txtid.getText();
    	String email = txtemail.getText();
    	
    	
       	// 1. DAO ��ü ���� 
    	MemberDao memberDao = MemberDao.getMemberDao();
    	
    	// 2. ��� ȸ���� �������� 
    	ArrayList<Member> members = memberDao.allmember();
    	
    	for( Member temp : members  ) {
    		if( temp.getId().equals(id) && temp.getEmail().equals(email) ) {
    			lblerror.setText("ã���� ��й�ȣ�� �̸��Ϸ� �����߽��ϴ�");
    			String password = temp.getPassword();
    			
    			// �������� �޼ҵ� ȣ�� [ �޴»���̸��� , Ÿ�� , ���뿡 ������ ] 
    			temp.emailsend(email, 3, password);
    			return;
    		}
    	}
    	
    	lblerror.setText("������ ������ ȸ�� ������ �����ϴ�");

    }

    @FXML
    void login(ActionEvent event) {

    }
	
	

}

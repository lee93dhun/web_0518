package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import DAO.MemberDao;
import domain.Member;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MupdateController implements Initializable {
	

    @FXML
    private Button btnupdate;

    @FXML
    private Button btncancel;

    @FXML
    private TextField txtname;

    @FXML
    private TextField txtemail;

    @FXML
    void cancel(ActionEvent event) {
    	MainController.getinstance().loadpage("info");
    }
    @FXML
    void update(ActionEvent event) {
    	
    	Member member = new Member();
    		member.setId(loginid); // ������Ʈ�� ���̵� 
    		member.setName( txtname.getText() ); // �Է¹��� �̸� 
    		member.setEmail( txtemail.getText() ); // �Է¹��� �̸��� 
    		
    	// 1. dao ��ü ���� 
    	MemberDao memberDao = MemberDao.getMemberDao();
    	//2 . dao �޼ҵ� ���� 
    	int result =  memberDao.updatemember( member );
    	
    	if( result == 1 ) { // ���� 
    	
    		MainController.getinstance().loadpage("info");
    	
    	}
    	else { // db ����  
    		
    	}
    	
    }
    private String loginid; // �α��ε� ���̵� ������ ���� ���� 
	
   	@Override
   	public void initialize(URL arg0, ResourceBundle arg1) {
   		
   		loginid = LoginController.getintance().getid() ;
   		
   		// 1. DAO ��ü ���� 
   		MemberDao memberDao = MemberDao.getMemberDao();
   		
   		// 2. DAO �޼ҵ� ���� [ �α��ε� ���̵� �־ ȸ������ �������� ]
   		Member member = memberDao.getmember(loginid);
   		
   		// 3. �� ��Ʈ�ѷ��� �־��ֱ� 
   		txtname.setText( member.getName() );
   		txtemail.setText( member.getEmail() );
   		
   	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

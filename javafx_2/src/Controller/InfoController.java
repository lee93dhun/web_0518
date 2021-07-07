package Controller;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import DAO.MemberDao;
import domain.Member;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;

public class InfoController implements Initializable   {


    @FXML
    private Button btndelete;

    @FXML
    private Button btnupdate;

    @FXML
    private Label txtid;

    @FXML
    private Label txtname;

    @FXML
    private Label txtemail;

    @FXML
    void delete(ActionEvent event) {
    	
    	// 1.�޽��� Ż�𿩺� ����� 
    	Alert alert = new Alert( AlertType.CONFIRMATION);
    	alert.setContentText(" ���� Ż���Ͻðڽ��ϱ�? ");
    	alert.setHeaderText("ȸ��Ż��");
    	
    		// �޽������� ������ ��ư ��������
    	Optional<ButtonType> result = alert.showAndWait();
    	
    	if( result.get() == ButtonType.OK ) { // Ȯ�� ��ư�� ��������
    		// Ż��
    		// 1. dao ��ü ���� 
    		MemberDao memberDao = MemberDao.getMemberDao();
    		// 2. dao �޼ҵ� ���� 
    		int result2 =  memberDao.deletemember(loginid);
    		
    		if( result2 == 1 ) { 
    			Platform.exit(); // ��� �������� ���� 
    		}
    		
    	}else {
    		// Ż�� ���
    		return; // �޼ҵ� ���� 
    	}
    	
    	
    }

    @FXML
    void update(ActionEvent event) {
    	MainController.getinstance().loadpage("mupdate");
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
		txtid.setText( member.getId() );
		txtname.setText( member.getName() );
		txtemail.setText( member.getEmail() );
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

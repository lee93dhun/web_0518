package Controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import DAO.MemberDao;
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
    	
    	// ȸ�����Խ� �Էµ� �����͸� DB�� �ֱ�
    	String id = txtid.getText();
    	String passowrd = txtpassword.getText();
    	String passowrd2 = txtpassword2.getText();
    	String name = txtname.getText();
    	String email = txtemail.getText();
    	
    	// 1. DAO ��ü ���� 
    	MemberDao memberDao = MemberDao.getMemberDao();
    	
    	// 2. ��� ȸ���� �������� 
    	ArrayList<Member> members = memberDao.allmember();
    	
    	// 1. �ߺ����̵� ���� 
    	for( Member temp : members ) {
    		if( temp.getId().equals(id) ) {
    			lblerror.setText("���Խ��� : ������ ���̵� �����մϴ� ");									
    			return;
    		}
    	}
    	
    	// 2. �н����� , Ȯ���н����尡 �������� �������
    	if( !passowrd.equals(passowrd2) ) {
    		lblerror.setText("���Խ��� : �н����尡 ���� �ٸ��ϴ� ");
    		// ! : ���� [ �ݴ� ]
			return;
    	}
    	// 3. email �� @ ���ԵǾ� ���� �ʴ� ��� 
    	if( email.indexOf("@") == -1 ) {
    		lblerror.setText("���Խ��� : �̸��� ������ �ƴմϴ� ");
			return;
    	}
    	
    	Member temp = new Member(id, passowrd, name, email);
    	
    	
    		// 2. DAO ȸ������ �޼ҵ� ȣ�� 
    	int result = memberDao.setmember(temp);
    	
    		// 3. ��ȯ ���� 
    	if( result == 1 ) {
    		lblerror.setText("ȸ������ �Ϸ� : �������ּż� �����մϴ� ");
    		// �޼��� â ���� 
    			Alert alert = new Alert( AlertType.INFORMATION);
    			alert.setContentText(" �������ּż� �����մϴ� ");
 				alert.setHeaderText("ȸ������ ����");
    			alert.showAndWait(); // Ȯ�� ��ư ������������ ������ 
    	// �������� ���� 
    		btnsignup.getScene().getWindow().hide();
    		
    	}else {
    		lblerror.setText("ȸ������ ���� : [�����ͺ��̽� ����] �����ڿ��� ���� ");
    		// �޼��� â ���� 
    			Alert alert = new Alert( AlertType.INFORMATION);
    			alert.setContentText(" [�����ͺ��̽� ����] �����ڿ��� ���� ");
 				alert.setHeaderText("ȸ������ ����");
    			alert.showAndWait(); // Ȯ�� ��ư ������������ ������ 
    	}
    	
    	
    	// ���� ó�� [ ����Ʈ => ���� ] 
    		// FileUtil.writefile("C:/Users/User/git/web_0518/javafx_2/src/File/", "memberlist.txt",  Start.memberlist );

    }
   
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

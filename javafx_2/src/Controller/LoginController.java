package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import DAO.MemberDao;
import application.Start;
import domain.Member;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class LoginController implements Initializable {
	
	// �α��� ������ main��Ʈ�ѿ��� �α��μ����� id �ѱ�� 
	
	private static LoginController instance; // �ӽð�ü
	
	public LoginController() {
		instance = this;
	}
	
	public static LoginController getintance() {
		return instance;
	}
	public String getid() {
		return txtid.getText();
	}
	
	// FXML ���� �ϴ� Ŭ���� 
	
	@Override  // FXML �ʱⰪ 
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		loading.setVisible(false); // �̹��� ����� 	
	}
	
	// ��Ʈ�ѵ��� ��ü �������� 
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
    	
    	try {
			Parent parent = FXMLLoader.load(getClass().getResource("/FXML/findid.fxml"));
			
			Scene scene = new Scene( parent );
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.setResizable(false);
			stage.setTitle("Nike Find ID");
			stage.show();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void findpassword(MouseEvent event) {
    	
    	try {
			Parent parent = FXMLLoader.load(getClass().getResource("/FXML/findpassword.fxml"));
			
			Scene scene = new Scene( parent );
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.setResizable(false);
			stage.setTitle("Nike Find Passowrd");
			stage.show();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }

    @FXML
    void login(ActionEvent event) {
    	loading.setVisible(true);
    		// �ؽ�Ʈ����.getText() : �ؽ�Ʈ�� �Էµ� ������ ȣ��
														//
														//    	// �Էµ� ȸ���� ����ȸ���� ���ؼ� �α��� 
														//    	for( Member temp : Start.memberlist ) {
														//    		//  �ӽð�ü : ����Ʈ�� 
														//    				// ����Ʈ�� ��ü����ŭ �ϳ��� �ӽð�ü�� ���� 
														//    		if( temp.getId().equals( txtid.getText() )  
														//    				&& temp.getPassword().equals( txtpassword.getText() ) ) {
														//    			
														//    			// �α��� ������ ���� â �ݱ� => ���ο� main �������� ���� 
														//    			
														//    		 	// �������� ����  : ���� ���� ��Ʈ�Ѹ�
														//    			btnlogin.getScene().getWindow().hide();
														//    			
														//    			try {
														//    				Stage stage = new Stage();
														//    				Parent parent = FXMLLoader.load(getClass().getResource("/FXML/main.fxml"));
														//    				Scene scene = new Scene(parent);
														//    				stage.setScene(scene);
														//    				stage.show();
														//    			}
														//    			catch (Exception e) {
														//					// TODO: handle exception
														//				}
														//    			
														//    			
														//    			return;
														//    		}  		
														//    	}
    	
    	// db �α��� 
    		// 1. dao ��ü ����� 
    	MemberDao memberDao = MemberDao.getMemberDao();
    		// 2. login �޼ҵ� ȣ�� 
    	int result = memberDao.login( txtid.getText() , txtpassword.getText() );
    								// �α���â�� �Էµ� ���̵� , �Էµ� �н����� 
    		// 3. ��� ���� 
    	if( result == 1 ) {
    	 	 //�������� ����  : ���� ���� ��Ʈ�Ѹ�
			btnlogin.getScene().getWindow().hide();
			
			try {
				Stage stage = new Stage();
				Parent parent = FXMLLoader.load(getClass().getResource("/FXML/main.fxml"));
				Scene scene = new Scene(parent);
				stage.setScene(scene);
				stage.show();
			}
			catch (Exception e) {
				// TODO: handle exception
			}	
			
    	}else if( result == 2 ) {
    		// �޼��� â ���� 
    		Alert alert = new Alert( AlertType.INFORMATION);
    		alert.setContentText(" ȸ������ ���̵� Ȥ�� ��й�ȣ�� �ٸ��ϴ� ");
    		alert.setHeaderText("�α��� ����");
    		alert.showAndWait(); // Ȯ�� ��ư ������������ ������ 
    	}
    	else {
			Alert alert = new Alert( AlertType.INFORMATION);
			alert.setContentText(" [�����ͺ��̽� ����] �����ڿ��� ���� ");
			alert.setHeaderText("ȸ������ ����");
			alert.showAndWait(); // Ȯ�� ��ư ������������ ������ 
    	}
    	
    	
	
    	
    }
    
    @FXML
    void sigup(ActionEvent event) {
    	try {
			Parent parent = FXMLLoader.load( getClass().getResource("/FXML/signup.fxml"));
			
			Scene scene = new Scene(parent);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.setResizable(false);
			stage.setTitle("Nike signup");
			stage.show();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    	
    	

    }
    
    
    
    
    
    
    
    

	
    
    
    
    
    
    
    
    
    
    
    
}

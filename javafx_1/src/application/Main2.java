package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main2 extends Application {
	
	//2. Start �޼ҵ� �������̵� [ ������ ]
	@Override
	public void start(Stage stage) throws Exception {
					// �������� Ŭ���� ��ü �̸����ϱ� 
		// 3. fxml ������ ��üȭ [ ������ ������ fxml ������ java�� �������� ]
		// Parent parent = FXMLLoader.load( getClass().getResource("�׽�Ʈ1.fxml"));
		Parent parent = FXMLLoader.load( getClass().getResource("�׽�Ʈ2.fxml"));
			// Parent : ��� ���̾ƿ�[fxml] �� ��� Ŭ���� 
		// 4. �� => fxml �ֱ� 
		Scene scene = new Scene( parent );
		// 5. �������� => �� �ֱ� 
		stage.setScene(scene);
		// 6. �������� ���� 
		stage.show();
	}
	// 1. ���� 
	public static void main(String[] args) {
		launch(args); // => Start �޼ҵ� 
	}
}

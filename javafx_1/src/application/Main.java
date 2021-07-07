package application;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application{

	// 1. �ش� Ŭ�������� javafx ��ӹޱ�
	// 2. main�޼ҵ忡 launch�޼ҵ� ���� [ �ʼ� ] 
	// 3. start() �޼ҵ� Override �ϱ� [ �ʼ� ]
		// javafx ���� 
			// 1. Stage : window â
			// 2. Scene : Stage �ȿ� ���� �������� ȭ�� 
			// 3. Graph : ���̾ƿ� , ��Ʈ�� , ��ư ��  	
	
	@Override
	public void start(Stage ��������) throws Exception {
					// 1. �������� Ŭ���� ��ü�� 
		// 2. ���̾ƿ� ���� 
		VBox ���̾ƿ� = new VBox();
		// ���̾ƿ� ���� 
		���̾ƿ�.setAlignment(Pos.CENTER); // ��� ����
		
			// 3. ��Ʈ�� ���� 
			Button ��ư = new Button();
			// 4. ��Ʈ�� ���� 
			��ư.setText("Ŭ��");
			��ư.setOnAction( �μ� -> Platform.exit() );
			
			// 3. ���̺� ���� 
			Label ���̺� = new Label();
			���̺�.setText("�ȳ��ϼ��� fx �Դϴ�");
			���̺�.setFont( new Font(20) );
			
		// 5. ���̾ƿ��� ��Ʈ�� �ֱ� 
		���̾ƿ�.getChildren().add(��ư);
		���̾ƿ�.getChildren().add(���̺�);
		
		// 6. �� ���� => ���̾ƿ� �ֱ�   //���� , ���� ������ 
		Scene �� = new Scene(���̾ƿ� , 500 , 500 );
		// 7. ���������� �� �ֱ� 
		��������.setScene(��);
		��������.setTitle("javafx â");
		// 8. �������� ���� 
		��������.show();
	}	
	public static void main(String[] args) {
		launch(args); // start �޼ҵ� ȣ��
	}
	
	
	
	
	

}

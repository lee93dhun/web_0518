package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage ) {
		// fxml -> scene -> stage
		try {
			Parent parent = FXMLLoader.load( getClass().getResource("server.fxml"));
			Scene scene = new Scene(parent);
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);	// stage ũ�⺯��Ұ� 
			primaryStage.setTitle("[����]");		// stage ��� �̸� 
				//primaryStage.getIcons().add( new Image("file:�����ǰ��")); // stage ������ 
			primaryStage.getIcons().add( new Image("file:C:/Users/User/Desktop/H/java1/javafx_server/src/application/īī����.png"));
			primaryStage.show();
			
		}catch (Exception e) {
			// TODO: handle exception
		}

	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

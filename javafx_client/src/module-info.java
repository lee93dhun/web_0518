module javafx_client {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens application to javafx.graphics, javafx.fxml;
	// opens ��Ű���� to ���̺귯�� 
}

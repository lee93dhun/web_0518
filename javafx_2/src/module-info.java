module javafx_2 {
	
	// javafx ��� => ���̺귯�� 
	requires javafx.controls;
	requires javafx.fxml;
	requires activation; 
	requires mail;
	requires java.sql;
	
	// ���Ǵ� ��Ű���� to ���� 
	opens application to javafx.graphics, javafx.fxml , javafx.controls;
	opens Controller to javafx.graphics, javafx.fxml , javafx.controls;
	opens domain to activation , mail , javafx.base;
	opens DAO to java.sql;
	

}

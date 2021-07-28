package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class BoardDao {
	
	
	private Connection conn;
	private ResultSet resultSet;	
	
	public static BoardDao instance = new BoardDao();
	
	public static BoardDao getinstance() {
		return instance;
	}
	public BoardDao() {
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/jspweb?serverTimezone=UTC", "root" , "1234" );
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	

}

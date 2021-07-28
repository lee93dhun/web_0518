package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Dto.Board;

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
	
	// 1. �۾��� �޼ҵ� 
	public int bwrite( Board board ) {
	
		// 1. SQL => ���� => ���� => ��� 
		String SQL = "insert into board( btitle , bcontents , bwriter, bdate , bcount)"+"values(?,?,?,?,?)";
		try {
			PreparedStatement statement = conn.prepareStatement(SQL);
			statement.setString(1, board.getBtitle() );
			statement.setString(2, board.getBcontents() );
			statement.setString(3, board.getBwriter() );
			statement.setString(4, board.getBdate() );
			statement.setInt(5, board.getBcount() );
			
			statement.executeUpdate();
			
			return 1; 
		}
		catch (Exception e) {}
		return 0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}

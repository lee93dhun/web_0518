package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Dto.BcommentDto;
import Dto.NoticeDto;

public class BcommentDao {
	
	Connection connection; // sql ���� �������̽� 
	ResultSet resultSet; // sql ��� ��ȸ �������̽� 
	
	public static BcommentDao instance = new BcommentDao(); // ���� Ŭ������ ���簴ü ����;
	public static BcommentDao getinstance() {
		return instance;
	}
	
	public BcommentDao() {
		try {
			// sql ����̹� : sql ���� �ٸ�
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/jspweb?serverTimezone=UTC", "root" , "1234" );
			
		}catch (Exception e) {
		}
	}
	
	// ��� ��� 
	public int bcommentwrite( BcommentDto bcommentDto   ) {
		
		String Sql = "insert into bcomment( nno , bccontents , bcwriter) values(?,?,?)";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(Sql);
			preparedStatement.setInt( 1 , bcommentDto.getNno()  );
			preparedStatement.setString( 2 , bcommentDto.getBccontents()  );
			preparedStatement.setString( 3 , bcommentDto.getBcwriter()  );

			preparedStatement.executeUpdate();
			
			return 1; 
			
		}
		catch (Exception e) {}
		return 0;
	}
	// ��� ��� 
	
	// ��� ���� 
	
	
}
	
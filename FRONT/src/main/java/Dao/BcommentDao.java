package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Dto.BcommentDto;
import Dto.NoticeDto;

public class BcommentDao {
	
	Connection connection; // sql 연결 인터페이스 
	ResultSet resultSet; // sql 결과 순회 인터페이스 
	
	public static BcommentDao instance = new BcommentDao(); // 현재 클래스에 현재객체 선언;
	public static BcommentDao getinstance() {
		return instance;
	}
	
	public BcommentDao() {
		try {
			// sql 드라이버 : sql 마다 다름
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/jspweb?serverTimezone=UTC", "root" , "1234" );
			
		}catch (Exception e) {
		}
	}
	
	// 댓글 등록 
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
	// 댓글 출력 
	
	// 댓글 삭제 
	
	
}
	
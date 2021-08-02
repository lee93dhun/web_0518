package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Dto.NoticeDto;

public class NoticeDao {
	
	Connection connection; // sql 연결 인터페이스 
	ResultSet resultSet; // sql 결과 순회 인터페이스 
	
	public static NoticeDao instance = new NoticeDao(); // 현재 클래스에 현재객체 선언;
	public static NoticeDao getinstance() {
		return instance;
	}
	
	public NoticeDao() {
		try {
			// sql 드라이버 : sql 마다 다름
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/jspweb?serverTimezone=UTC", "root" , "1234" );
			
		}catch (Exception e) {
		}
	}
	
	// 게시물 작성 
	public int noticewrite( NoticeDto noticeDto) {
		
		String SQL = "insert into notice( ntitle , ncontents , nwriter , ncount , nfile ) values( ? , ? , ? , ? , ? )";
		try {
			
			PreparedStatement statement = connection.prepareStatement(SQL);
			statement.setString(1, noticeDto.getNtitle() );
			statement.setString(2, noticeDto.getNcontents() );
			statement.setString(3, noticeDto.getNwriter() );
			statement.setInt(4, noticeDto.getNcount() );
			statement.setString(5, noticeDto.getNfile() );
			
			statement.executeUpdate();
			
			return 1; 
		}
		catch (Exception e) {} 
		return 0;
	}
	
	
	

}

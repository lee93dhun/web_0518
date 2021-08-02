package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Dto.NoticeDto;

public class NoticeDao {
	
	Connection connection; // sql ���� �������̽� 
	ResultSet resultSet; // sql ��� ��ȸ �������̽� 
	
	public static NoticeDao instance = new NoticeDao(); // ���� Ŭ������ ���簴ü ����;
	public static NoticeDao getinstance() {
		return instance;
	}
	
	public NoticeDao() {
		try {
			// sql ����̹� : sql ���� �ٸ�
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/jspweb?serverTimezone=UTC", "root" , "1234" );
			
		}catch (Exception e) {
		}
	}
	
	// �Խù� �ۼ� 
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

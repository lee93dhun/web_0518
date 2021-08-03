package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

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
	
	// ��� �Խù� ��� 
	public ArrayList<NoticeDto> noticelist(){
		
		ArrayList<NoticeDto> noticeDtos = new ArrayList<NoticeDto>();
		
		String SQL = "select * from notice order by nno DESC";	
									// Order by �ʵ�� asc : �������� 
									// Order by �ʵ�� desc : �������� 
		try {
			PreparedStatement statement = connection.prepareStatement(SQL);
			
			resultSet = statement.executeQuery();
			
			while( resultSet.next() ) {
				
				NoticeDto noticeDto = new NoticeDto(
						resultSet.getInt(1), 
						resultSet.getString(2),
						resultSet.getString(3),
						resultSet.getString(4),
						resultSet.getString(5), 
						resultSet.getInt(6),
						resultSet.getString(7));
				noticeDtos.add(noticeDto);
			}
			return noticeDtos;
		}
		catch (Exception e) {
		} 
		return null;
	}
	
	// �˻��� �ִ� ��� �Խù� ��� 
	public ArrayList<NoticeDto> noticekeyword( String key , String keyword ){
		
		ArrayList<NoticeDto> noticeDtos = new ArrayList<NoticeDto>();

		// String SQL = "select * from notice where "+key+" = "+keyword;
		// Ű���尡 ���Ե� �ʵ� ã��
		String SQL ="select * from notice where "+key+" like '%"+keyword+"%' order by nno DESC";
								//  �ʵ�� = ã����			[ �ش� �ʵ忡�� ���� ������ ���ڵ� ã��  ]  
								//  �ʵ�� like '%ã����%' 	[ �ش� �ʵ忡�� ���� ���Ե� ���ڵ� ã�� ] 
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(SQL);
			resultSet = preparedStatement.executeQuery();
			
			while( resultSet.next() ) {
				NoticeDto noticeDto = new NoticeDto(
						resultSet.getInt(1), 
						resultSet.getString(2),
						resultSet.getString(3),
						resultSet.getString(4),
						resultSet.getString(5), 
						resultSet.getInt(6),
						resultSet.getString(7));
				noticeDtos.add(noticeDto);
			}
			return noticeDtos;
		}
		catch (Exception e) {}
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

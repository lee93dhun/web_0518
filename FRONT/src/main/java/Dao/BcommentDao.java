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
	// 해당 게시물의 모든 댓글 출력 
	public ArrayList<BcommentDto> bcommentlist( int nno){
		
		String Sql = "select * from bcomment where nno = ?";
		
		ArrayList<BcommentDto> bcommentDtos = new ArrayList<BcommentDto>();
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(Sql);
			
			preparedStatement.setInt(1, nno);
			
			resultSet = preparedStatement.executeQuery();
			
			 while( resultSet.next() ) {
				 	
				 BcommentDto bcommentDto = new BcommentDto(
						 	resultSet.getInt(1),
							resultSet.getInt(2),
							resultSet.getString(3),
							resultSet.getString(4),
							resultSet.getString(5) );
				 bcommentDtos.add(bcommentDto);
			 }
			 return bcommentDtos;
	
		}catch (Exception e) {}
		return null;
	}
	
	// 댓글 삭제 [ 인수 : 댓글번호 / 반환 : x ] 
	public int bcommentdelete( int bcno ) {
		
		String sql = "delete from bcomment where bcno = ?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, bcno);
			preparedStatement.executeUpdate();
			
			return 1; 
		}catch (Exception e) {}
		return 0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	// 댓글 삭제 
	
	
}
	
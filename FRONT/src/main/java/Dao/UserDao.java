package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Dto.UserDto;

public class UserDao {
	
	Connection connection; // sql 연결 인터페이스 
	ResultSet resultSet; // sql 결과 순회 인터페이스 
	
	public static UserDao instance = new UserDao(); // 현재 클래스에 현재객체 선언;
	public static UserDao getinstance() {
		return instance;
	}
	
	public UserDao() {
		try {
			// sql 드라이버 : sql 마다 다름
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/jspweb?serverTimezone=UTC", "root" , "1234" );
			
		}catch (Exception e) {
		}
	}
	
	// 회원가입 메소드 
	public int usersignup( UserDto dto ) {
		
		String SQL = "insert into user( uid,upassword,uname,uaddress , uemail , upoint) values(?,?,?,?,?,?)";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(SQL);
			
			preparedStatement.setString(1, dto.getUid());
			preparedStatement.setString(2, dto.getUpassword());
			preparedStatement.setString(3, dto.getUname());
			preparedStatement.setString(4, dto.getUaddress());
			preparedStatement.setString(5, dto.getUemail());
			preparedStatement.setInt(6, dto.getUpoint());
			
			preparedStatement.executeUpdate();
			return 1; 
			
		}catch (Exception e) {}
		return 0;
	}
	
	// 로그인 메소드 

	// 모든 회원 조회 
	
	// 개별 회원 조회 
	
	// 회원수정 메소드 
	
	// 회워탈퇴 메소드 
	
	
}

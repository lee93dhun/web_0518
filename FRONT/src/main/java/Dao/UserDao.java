package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Dto.UserDto;

public class UserDao {
	
	Connection connection; // sql ���� �������̽� 
	ResultSet resultSet; // sql ��� ��ȸ �������̽� 
	
	public static UserDao instance = new UserDao(); // ���� Ŭ������ ���簴ü ����;
	public static UserDao getinstance() {
		return instance;
	}
	
	public UserDao() {
		try {
			// sql ����̹� : sql ���� �ٸ�
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/jspweb?serverTimezone=UTC", "root" , "1234" );
			
		}catch (Exception e) {
		}
	}
	
	// ȸ������ �޼ҵ� 
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
	
	// �α��� �޼ҵ� 

	// ��� ȸ�� ��ȸ 
	
	// ���� ȸ�� ��ȸ 
	
	// ȸ������ �޼ҵ� 
	
	// ȸ��Ż�� �޼ҵ� 
	
	
}

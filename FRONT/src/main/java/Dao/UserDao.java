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
	public int userlogin( String uid , String upassword ) {
		
		
		String SQL = "select * from user where uid =? and upassword = ? ";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(SQL);
			preparedStatement.setString(1, uid);
			preparedStatement.setString(2, upassword);
			
			resultSet = preparedStatement.executeQuery();
			
			if( resultSet.next() ) {
				return 1; // ������ ȸ��o
			}
			return 2; // ������ ȸ��x 
		}catch(Exception e) {}
		return 0; // db ���� 
	}

	// ��� ȸ�� ��ȸ 
	
	// ���� ȸ�� ��ȸ [ �μ� : ���̵� / ��ȯ : ���̵��� ��� ���� ���[ ��й�ȣ ���� ] 
	public UserDto getuser( String uid) {
		
		String SQL ="SELECT * from user where uid=?";
		try {
			
			PreparedStatement preparedStatement = connection.prepareStatement(SQL);
			preparedStatement.setString(1, uid);
			
			resultSet =  preparedStatement.executeQuery();
			
			if( resultSet.next() ) {
				UserDto userDto = new UserDto(
						resultSet.getInt(1), 
						resultSet.getString(2),
						resultSet.getString(3),
						resultSet.getString(4),
						resultSet.getString(5),
						resultSet.getString(6),
						resultSet.getInt(7) );
				return userDto;
				
			}
			
		}catch (Exception e) {}
		return null;
	}
	// ȸ������ �޼ҵ� 
	public int userupdate( int nno , UserDto userDto) {
		String sql = "update user set upassword=? , uname=? , uaddress=? , uemail =? where uno = ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, userDto.getUpassword() );
			preparedStatement.setString(2, userDto.getUname() );
			preparedStatement.setString(3, userDto.getUaddress() );
			preparedStatement.setString(4, userDto.getUemail() );
			preparedStatement.setInt(5, nno );
			preparedStatement.executeUpdate();
			return 1;
		}catch (Exception e) {}
		return 0;
		
	}
	
	// ȸ��Ż�� �޼ҵ� 
	public int userdelete( int uno , String password ) {
		
		String SQL ="delete from user where uno=? and upassword = ?";
					// �α��ε� ȸ����ȣ�� ��й�ȣ�� �����Ѱ�� 
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(SQL);
			preparedStatement.setInt(1, uno);
			preparedStatement.setString(2, password);
			preparedStatement.executeUpdate();
			return 1;
		}catch (Exception e) {}
		return 0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

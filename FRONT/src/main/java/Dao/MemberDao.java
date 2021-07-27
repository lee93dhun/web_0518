package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Dto.Member;

public class MemberDao {
	
	private Connection conn;
	private ResultSet rs;
	
	private static MemberDao instance = new MemberDao();
	
	public static MemberDao getinstance() {
		return instance;
	}
	
	public MemberDao() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/jspweb?serverTimezone=UTC", "root" , "1234" );
		
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	// 1. ȸ������ �޼ҵ� 
	
	public int signup( Member member ) {
		
		// 1. SQL �ۼ� 
		String SQL = "insert into member(mid , mpassword , mname , memail , mphone , maddress )"+"values(?,?,?,?,?,?)";
		
		// 2. SQL ���� 
		try {
			PreparedStatement statement = conn.prepareStatement(SQL);
			statement.setString(1, member.getMid() );
			statement.setString(2, member.getMpassword() );
			statement.setString(3, member.getMname() );
			statement.setString(4, member.getMemail() );
			statement.setString(5, member.getMphone() );
			statement.setString(6, member.getMaddress() );
		
		// 3. SQL ���� 
			statement.executeUpdate();
			return 1;
		}
		catch (Exception e) {}
		return 0;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import domain.Member;


public class MemberDao {
	
	
	Connection conn; // DB�� �������ִ� �������̽� ���� 
	private static MemberDao memberDao = new MemberDao(); // ���� Ŭ������ ��ü 
	
	public static MemberDao getMemberDao() {	// dao ��ü�� ��ȯ���ִ� �޼ҵ� 
		return memberDao;
	}
	
	public MemberDao() { // ������ : ��ü�� �ʱⰪ 
		// db ���� 
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Ŭ���� ã�� 
				// mysql ����̹� �̸� : com.mysql.cj.jdbc.Driver
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/javafx?serverTime=UTC" , "root" , "1234");
														// DBURL // ip�ּ�:port��ȣ/DB�� ? �ð��� = UTC  , "������" , "��й�ȣ" 
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	// ȸ������ �޼ҵ� 
	public int setmember( Member temp ) {
		// SQL ���ǹ� 
		String SQL = "insert into member(id,password,name,email)"+"values(?,?,?,?)";
			// ���̺� ������ �߰� 
			// 1. ��� �ʵ忡 �� ������� => �ʵ�� ���� 
				// insert into ���̺�� values( ��1, ��2, ��3, ��4 ) 
			// 2. Ư�� �ʵ忡�� ���� ������� => �ʵ�� �Է�
				// insert into ���̺��(�ʵ��1,�ʵ��2,�ʵ��3,�ʵ��4) values( ��1, ��2, ��3, ��4 ) 
					// ? : �Ű�����
		// SQL DB�� ������ 
		try {
			PreparedStatement pstmt = conn.prepareStatement(SQL);
				// PreparedStatement : ����� DB ���� �ϴ� �������̽� 
				// �Ű������� ������ �ֱ� 
					// setString( ?���� , ������ ) 
				pstmt.setString(1, temp.getId() );
				pstmt.setString(2, temp.getPassword() );
				pstmt.setString(3, temp.getName() );
				pstmt.setString(4, temp.getEmail() );
			// SQL ���� 
				pstmt.executeUpdate(); // SQL ������Ʈ => ���� 
			// ȸ������ ������ 1 ��ȯ  
			return 1; 
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		// ȸ������ ���н� 0 ��ȯ
		return 0; 
	}
	
	// �α��� �޼ҵ� 
	public int login( String id , String password  ) {
		
		// 1. SQL �ۼ� 
		String SQL = "select * from member where id = ? and password = ? ";	
			// �˻� 
			// 1. select �˻����ʵ�� from ���̺�� where ����[ �ʵ�� = �� ] 
			// 2. select *[����ʵ�˻�] from ���̺�� 
				// * [ ��� �ʵ� ���� ] 
				// ����1 and ����2  : �̸鼭
				// ����1 or ����2   : �̰ų�
		
		// 2. SQL ����  
		try {
			PreparedStatement statement = conn.prepareStatement(SQL);
			// 3. SQL ���� 
			statement.setString(1, id);
			statement.setString(2, password);
			// 4. SQL ���� 
			// �˻������ �������̽��� �����ؼ� �������� 
			ResultSet resultSet = statement.executeQuery();
				// ����.executeQuery();  sql ���� 
				// ResultSet �������̽� : select ����� �������ִ� �������̽� 
					// .next() : �˻������ �ϳ��� �̵�
			if( resultSet.next() ) { // �ϳ��� ����� ���������� 
				return 1; // �α��� ���� 
			}else {
				return 2; // ������ ���̵�� ��й�ȣ ���� 
			}	
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return 0; // db ���� 
	}
	
	// ��� ȸ�� ��� 
	public ArrayList<Member> allmember(){
			// Ÿ��Ÿ�� : ����Ʈ
		// ã�� ȸ���� ���� ����Ʈ 
		ArrayList<Member> members = new ArrayList<Member>();
	
		// 1. SQL �ۼ� 
		String SQL = "select * from member";
				// select �ʵ�� from ���̺�� ; => ��� �ʵ� �˻� 
		try {
			// 2. ����� DB�� SQL �����ϱ� 
			PreparedStatement statement = conn.prepareStatement(SQL);
			
			// 3. sql ���� => ���
			ResultSet resultSet = statement.executeQuery();
			
			// 4. �˻� ����� ����Ʈ�� ��� 
			while( resultSet.next() ) {
				
				Member member = new Member();
			
				member.setId(  resultSet.getString(2) );
				member.setPassword( resultSet.getString(3));
				member.setName( resultSet.getString(4));
				member.setEmail( resultSet.getString(5));
			
				members.add(member);
			}
			
		}
		catch (Exception e) {}
		// ����Ʈ ��ȯ 
		return members; 
	}
	
	
	// ���̵� �ش��ϴ� ȸ������ ��ȯ
	public Member getmember( String logid) {
		
		// 0. �ӽ� ȸ��
		Member member = new Member();
		// 1. SQL �ۼ� 
		String SQL = "select * from member where id=?";
		// 2. SQL ���� 
		try {
			PreparedStatement statement = conn.prepareStatement(SQL);
				statement.setString( 1 , logid );
		// 3.SQL ���� 
			ResultSet resultSet = statement.executeQuery();
		// 4. ���� ��� 
			if( resultSet.next() ) {
				member.setId( resultSet.getString(2) );
				member.setPassword( resultSet.getString(3) );
				member.setName( resultSet.getString(4));
				member.setEmail( resultSet.getString(5));
				return member; // �ش��ϴ� ���̵��� ȸ���� �������
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		return null ; // �ش��ϴ� ���̵��� ȸ���� ������� 
	}
	
	// �ش��ϴ� ���̵��� ȸ�� ���� �޼ҵ� 
	public int deletemember( String logid) {
		
		// 1. SQL �ۼ� 
		String SQL = "select * from member where id=?";
		// 2. SQL ���� 
		try {
			PreparedStatement statement = conn.prepareStatement(SQL);
			statement.setString(1, logid);
			// 3. SQL ���� 
			ResultSet resultSet = statement.executeQuery();
			// 4. SQL ��� 
			if( resultSet.next() ) {
				// Ż�� SQL 
				SQL = "delete from member where id=?";
				statement = conn.prepareStatement(SQL);
				statement.setString(1, resultSet.getString(2) );
				statement.executeUpdate();
				return 1; // ���� ���� 
			}else {
				return 2; // ȸ�������� ���� ����
			}
		}catch (Exception e) {	}
		return 0; // db ���� 
	}
	
	// ȸ�� ������Ʈ �޼ҵ� 
	public int updatemember( Member member ) {
		
		// 1. SQL �ۼ�
		String SQL = "update member set name =? , email = ? where id = ?";
		//2. SQL ����
		try {
			PreparedStatement statement = conn.prepareStatement(SQL);
			statement.setString(1, member.getName() );
			statement.setString(2, member.getEmail() );
			statement.setString(3, member.getId() );
			//3.SQL ����
			statement.executeUpdate();
			//4.SQL ���
			return 1; // ���� ����
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		return 0; // ���� 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import domain.Member;

public class MemberDao {
	
	
	Connection conn; // DB와 연결해주는 인터페이스 선언 
	private static MemberDao memberDao = new MemberDao(); // 현재 클래스의 객체 
	
	public static MemberDao getMemberDao() {	// dao 객체를 반환해주는 메소드 
		return memberDao;
	}
	
	public MemberDao() { // 생성자 : 객체의 초기값 
		// db 연동 
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 클래스 찾기 
				// mysql 드라이버 이름 : com.mysql.cj.jdbc.Driver
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/javafx?serverTime=UTC" , "root" , "1234");
														// DBURL // ip주소:port번호/DB명 ? 시간대 = UTC  , "계정명" , "비밀번호" 
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	// 회원가입 메소드 
	public int setmember( Member temp ) {
		// SQL 질의문 
		String SQL = "insert into member(id,password,name,email)"+"values(?,?,?,?)";
			// 테이블에 데이터 추가 
			// 1. 모든 필드에 값 넣을경우 => 필드명 생략 
				// insert into 테이블명 values( 값1, 값2, 값3, 값4 ) 
			// 2. 특정 필드에만 값을 넣을경우 => 필드명 입력
				// insert into 테이블명(필드명1,필드명2,필드명3,필드명4) values( 값1, 값2, 값3, 값4 ) 
					// ? : 매개변수
		// SQL DB로 보내기 
		try {
			PreparedStatement pstmt = conn.prepareStatement(SQL);
				// PreparedStatement : 연결된 DB 조작 하는 인터페이스 
				// 매개변수에 데이터 넣기 
					// setString( ?순서 , 데이터 ) 
				pstmt.setString(1, temp.getId() );
				pstmt.setString(2, temp.getPassword() );
				pstmt.setString(3, temp.getName() );
				pstmt.setString(4, temp.getEmail() );
			// SQL 실행 
				pstmt.executeUpdate(); // SQL 업데이트 => 실행 
			// 회원가입 성공시 1 반환  
			return 1; 
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		// 회원가입 실패시 0 반환
		return 0; 
	}
	
	// 로그인 메소드 
	public int login( String id , String password  ) {
		
		// 1. SQL 작성 
		String SQL = "select * from member where id = ? and password = ? ";	
			// 검색 
			// 1. select 검색할필드명 from 테이블명 where 조건[ 필드명 = 값 ] 
			// 2. select *[모든필드검색] from 테이블명 
				// * [ 모든 필드 대응 ] 
				// 조건1 and 조건2  : 이면서
				// 조건1 or 조건2   : 이거나
		
		// 2. SQL 연결  
		try {
			PreparedStatement statement = conn.prepareStatement(SQL);
			// 3. SQL 조작 
			statement.setString(1, id);
			statement.setString(2, password);
			// 4. SQL 실행 
			// 검색결과을 인터페이스로 연결해서 가져오기 
			ResultSet resultSet = statement.executeQuery();
				// 연결.executeQuery();  sql 실행 
				// ResultSet 인터페이스 : select 결과와 연결해주는 인터페이스 
					// .next() : 검색결과를 하나씩 이동
			if( resultSet.next() ) { // 하나의 결과가 존재했을때 
				return 1; // 로그인 성공 
			}else {
				return 2; // 동일한 아이디와 비밀번호 없다 
			}	
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return 0; // db 오류 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import domain.Board;

public class BoardDao {
	
	Connection conn; // DB와 연결해주는 인터페이스 선언 
	private static BoardDao memberDao = new BoardDao(); // 현재 클래스의 객체 
	
	public static BoardDao getMemberDao() {	// dao 객체를 반환해주는 메소드 
		return memberDao;
	}
	
	public BoardDao() { // 생성자 : 객체의 초기값 
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
	
	// 글쓰기 메소드 
	public int boardwrie( Board board ) {
		
		//1. SQL 작성
		String SQL ="insert into board(btitle,bcontents,bwriter,bdate,bcount)"+"values(?,?,?,?,?)";
		//2. SQL 조작
		try {
			PreparedStatement statement = conn.prepareStatement(SQL); // SQL 오류 예외처리 
			statement.setString(1, board.getBtitle() ); // 첫번째 ?
			statement.setString(2, board.getBcontents() ); // 첫번째 ?
			statement.setString(3, board.getBwriter() ); // 첫번째 ?
			statement.setString(4, board.getBdate() ); // 첫번째 ?
			statement.setInt(5, board.getBcount() ); // 첫번째 ?
		//3. SQL 실행
			statement.executeUpdate(); // insert => update : 쿼리 실행 
		//4. SQL 결과
			return 1; // 성공시 
		}catch (Exception e) {}
		return 0; // 실패시 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

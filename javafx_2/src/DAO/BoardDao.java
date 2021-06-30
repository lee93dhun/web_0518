package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import domain.Board;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class BoardDao {
	
	Connection conn; // DB와 연결해주는 인터페이스 선언 
	private static BoardDao boardDao = new BoardDao(); // 현재 클래스의 객체 
	
	public static BoardDao getBoardDao() {	// dao 객체를 반환해주는 메소드 
		return boardDao;
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
	
	// 모든 게시물 출력 메소드 
	public ObservableList<Board> allboard(){
		
		// 임시 리스트 
		ObservableList<Board> boards = FXCollections.observableArrayList();
		
		// 1.SQL 작성 
		String SQL ="select * from board";
		// 2.SQL 조작 
		try {
			PreparedStatement statement = conn.prepareStatement(SQL);
		// 3.SQL 실행
		// 4.SQL 결과
			ResultSet resultSet =  statement.executeQuery(); // select 검색 => Query 결과
			
			// 5. 검색된 모든 게시물을 객체 => 리스트에 담기 
			while( resultSet.next() ) {
						// 검색결과의 다음 레코드가 존재하면 
				Board board = new Board();
					board.setBno( resultSet.getInt(1) );
					board.setBtitle( resultSet.getString(2));
					board.setBcontents( resultSet.getString(3));
					board.setBwriter( resultSet.getString(4));
					board.setBdate( resultSet.getString(5));
					board.setBcount( resultSet.getInt(6));
				boards.add(board); // 리스트 담기 
			}
			return boards; // 리스트 반환 
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return null; // db 오류시 null 반환 
	}
	
	// 조회수 증가  메소드 
	public void addcount( Board board) {
		
		String SQL = "update board set bcount = ? where bno =? ";
			// update 테이블명 set 필드명 = 변경값 where 조건문
		try {
			PreparedStatement statement = conn.prepareStatement(SQL);
			statement.setInt(1,  board.getBcount() );
			statement.setInt(2,  board.getBno() ); 
			
			statement.executeUpdate();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	// 게시물 삭제 메소드 
	public int delboard( Board board ) {
		
		String SQL ="delete from board where bno = ?";
			// delete from 테이블명 where 조건
		try {
			PreparedStatement statement = conn.prepareStatement(SQL);
			statement.setInt(1,board.getBno() ); // 게시물 번호 넣기 
			statement.executeUpdate();
			return 1; // 성공 
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return 0; // 실패 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

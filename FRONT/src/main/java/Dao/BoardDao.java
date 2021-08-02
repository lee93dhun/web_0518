package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Dto.Board;
import Dto.Reply;

public class BoardDao {
	
	
	private Connection conn;
	private ResultSet resultSet;	
	
	public static BoardDao instance = new BoardDao();
	
	public static BoardDao getinstance() {
		return instance;
	}
	public BoardDao() {
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/jspweb?serverTimezone=UTC", "root" , "1234" );
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	// 1. �۾��� �޼ҵ� 
	public int bwrite( Board board ) {
	
		// 1. SQL => ���� => ���� => ��� 
		String SQL = "insert into board( btitle , bcontents , bwriter, bdate , bcount)"+"values(?,?,?,?,?)";
		try {
			PreparedStatement statement = conn.prepareStatement(SQL);
			statement.setString(1, board.getBtitle() );
			statement.setString(2, board.getBcontents() );
			statement.setString(3, board.getBwriter() );
			statement.setString(4, board.getBdate() );
			statement.setInt(5, board.getBcount() );
			
			statement.executeUpdate();
			
			return 1; 
		}
		catch (Exception e) {}
		return 0;
	}
	
	// 2. ��� �Խù� ��� �޼ҵ� 
	public ArrayList<Board> blist(){
		
		ArrayList<Board> boards = new ArrayList<Board>();
		
		String SQL = "select * from board"; // ���Ǿ��� ��� �˻� 
		try {
			PreparedStatement statement = conn.prepareStatement(SQL);
			resultSet = statement.executeQuery();
			
			while( resultSet.next() ) {
				
				Board board = new Board(resultSet.getInt(1),
						resultSet.getString(2),
						resultSet.getString(3),
						resultSet.getString(4),
						resultSet.getString(5),
						resultSet.getInt(6));
				
				boards.add(board);
			}	
			return boards;
		}catch (Exception e) {}
		
		return null;
	}
	
	// 3. �Խù���ȣ�� �̿��� �Խù� ��� �޼ҵ� 
	public Board bview( int bno ) {
		
		String SQL = "select * from board where bno = ? ";
		try {
			PreparedStatement statement = conn.prepareStatement(SQL);
			statement.setInt(1, bno );
			
			resultSet = statement.executeQuery();
			
			if( resultSet.next() ) {
				Board board = new Board(resultSet.getInt(1),
						resultSet.getString(2), 
						resultSet.getString(3), 
						resultSet.getString(4), 
						resultSet.getString(5), 
						resultSet.getInt(6));
				return board;
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	// 4. �Խù���ȣ�� �̿��� �Խù� ���� �޼ҵ� 
	public int bdelete( int bno) {
		
		String SQL = "Delete from board where bno = ?";
		
		try {
			PreparedStatement statement = conn.prepareStatement(SQL);
			statement.setInt(1, bno);
			statement.executeUpdate();
			return 1 ;
		}catch (Exception e) {	}
		return 0 ;
	}
	
	// 5. �Խù� ���� �� ���� ������Ʈ �޼ҵ� 
	public int bupdate( int bno , Board board ) {
		
		String SQL = "update board set btitle=? , bcontents=? where bno = ? ";
		// update ���̺�� set �ʵ�1=��1 , �ʵ�2=��2 where ����
		try {
			PreparedStatement statement = conn.prepareStatement(SQL);
			statement.setString(1, board.getBtitle()  );
			statement.setString(2, board.getBcontents());
			statement.setInt( 3 , bno );
			
			statement.executeUpdate();
			return 1;			
		}
		catch (Exception e) {} 
		return 0;
	}
	
	// 6. ��� ���� �޼ҵ�  
	public int rwrite( Reply reply ) {
		
		String SQL = "insert into reply( bno , rwriter , rcontents , rdate)"+"values(?,?,?,?)";
		
		try {
			PreparedStatement statement = conn.prepareStatement(SQL);
			
			statement.setInt(1, reply.getBno()  );
			statement.setString(2, reply.getRwriter());
			statement.setString(3, reply.getRcontents());
			statement.setString(4, reply.getRdate());
			
			statement.executeUpdate();
			
			return 1; 
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
		
	}
	
	// 7. �Խù���ȣ�� �ش��ϴ� ��� ��� 
	public ArrayList<Reply> rlist( int bno ){
		
		String SQL = "select * from reply where bno = ? order by rno DESC ";
													// order by : ���� 
														// order by �ʵ�� ASC : �������� 
														// order by �ʵ�� DESC : ��������  
		ArrayList< Reply >replies = new ArrayList<Reply>();
		
		try {
			PreparedStatement statement  = conn.prepareStatement(SQL);
			statement.setInt(1, bno);
			resultSet = statement.executeQuery();
			
			while( resultSet.next()  ) {
				Reply reply = new Reply( resultSet.getInt(1) , 
						resultSet.getInt(2),
						resultSet.getString(3),
						resultSet.getString(4),
						resultSet.getString(5));
				replies.add(reply);
			}
			return replies;
			
		}catch (Exception e) {
			// TODO: handle exception
		} 
		return null;
		
	}
	// 8. ��� ���� 
	public int rdelete( int rno ) {
		
		String SQL = "Delete from reply where rno = ?";
		
		try {
			PreparedStatement statement = conn.prepareStatement(SQL);
			statement.setInt(1, rno);
			statement.executeUpdate();
			return 1 ;
		}catch (Exception e) {	}
		return 0 ;
		
	}
	
	// 9. �Խù� ��ȸ�� ���� 
	public void bcountup( int bno) {
		
		String SQL = "update board set bcount = bcount + 1 where bno = ? ";
		
		try {
			PreparedStatement statement = conn.prepareStatement(SQL);
			
			statement.setInt(1, bno);
			
			statement.executeUpdate();
		
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

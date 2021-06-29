package Controller;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import DAO.BoardDao;
import domain.Board;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class BoardwriteController implements Initializable {

	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
    @FXML
    private Button btnwrite;

    @FXML
    private TextField txttitle;

    @FXML
    private TextArea txtcontents;

    @FXML
    private Button btncancel;

    @FXML
    void cancel(ActionEvent event) {
    	// board 이동 
    	
    }
    @FXML
    void write(ActionEvent event) {
    	
    	String btitle = txttitle.getText();
    	String bcontents = txtcontents.getText();
    	String bwriter= LoginController.getintance().getid() ; // 로그인된 아이디 
    		Date date = new Date();
    		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    	String bdate = format.format(date);
    	
    	Board board = new Board(btitle, bcontents, bwriter, bdate, 0);
    	
    	// 1. Dao 객체 생성 
    	BoardDao boardDao = BoardDao.getMemberDao();
    	// 2. Dao 메소드 실행 
    	int result =  boardDao.boardwrie(board);
    	
    	if( result == 1 ) { // 성공
    		// board 이동 
    		
    	}
    	else {  // 실패
    		
    	}
    }

	
	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	
}

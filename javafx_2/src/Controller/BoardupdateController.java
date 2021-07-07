package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import DAO.BoardDao;
import domain.Board;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class BoardupdateController implements Initializable {
	
    @FXML
    private TextField txttitle;

    @FXML
    private TextArea txtcontents;

    @FXML
    private Button btncancel;

    @FXML
    private Button btnupdate;

    @FXML
    void cancel(ActionEvent event) {
    	MainController.getinstance().loadpage("board");
    }

    @FXML
    void update(ActionEvent event) {
    	
    	// 1. Dao 객체 생성 
    	BoardDao boardDao = BoardDao.getBoardDao();
    	// 2. Dao 메소드 호출 
    	int result =  boardDao.updateboard(board, txttitle.getText() , txtcontents.getText());
    	
    	if( result == 1 ) { // 수정 성공했을때 
    		MainController.getinstance().loadpage("board");
    	}else {
    		// 수정 실패 했을때 
    	}
    	
    }
    
    private static Board board;
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// board 에서 클릭된 게시물 가져오기 
		board =  BoardController.getinstance().getboard();
		
		// 각 컨트롤에 게시물 출력 
		txttitle.setText( board.getBtitle() );
		txtcontents.setText( board.getBcontents() );
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

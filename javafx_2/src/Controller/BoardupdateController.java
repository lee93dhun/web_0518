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
    	
    	// 1. Dao ��ü ���� 
    	BoardDao boardDao = BoardDao.getBoardDao();
    	// 2. Dao �޼ҵ� ȣ�� 
    	int result =  boardDao.updateboard(board, txttitle.getText() , txtcontents.getText());
    	
    	if( result == 1 ) { // ���� ���������� 
    		MainController.getinstance().loadpage("board");
    	}else {
    		// ���� ���� ������ 
    	}
    	
    }
    
    private static Board board;
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// board ���� Ŭ���� �Խù� �������� 
		board =  BoardController.getinstance().getboard();
		
		// �� ��Ʈ�ѿ� �Խù� ��� 
		txttitle.setText( board.getBtitle() );
		txtcontents.setText( board.getBcontents() );
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

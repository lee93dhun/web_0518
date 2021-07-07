package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import DAO.BoardDao;
import domain.Board;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

public class BoardController implements Initializable {
	
	// ���� Ŭ������ ��ü 
	private static BoardController instance;
	// ��ü ������
	public BoardController() {
		instance = this;
	}
	// ��ü ��ȯ �޼ҵ� 
	public static BoardController getinstance() {
		return instance;
	}
	// ���̺��� Ŭ���� �Խù� ��ȯ �޼ҵ�
	public Board getboard() {
		return board;
	}
	
	private static Board board; // �Խù� ��ü 
	

    @FXML
    private TableView<Board> tableview;
    		// tableviw : ����Ʈ ���� [ ObservableList ]
    		//  <  > : ���׸� => ���̺� ���� Ŭ������ 
    @FXML
    private Button btnwrite;

    @FXML
    void write(ActionEvent event) {
    	// ���� ��ư�� �������� => ȭ����ȯ 
    	MainController.getinstance().loadpage("boardwrite");
    }
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		// 1. DAO ��ü ���� 
		BoardDao boardDao = BoardDao.getBoardDao();
		// 2. DAO �޼ҵ� ���� 
		ObservableList<Board> boards = boardDao.allboard();
	
		// �� ���� �� �ֱ�
		TableColumn tc = tableview.getColumns().get(0); // ù��° �ʵ� �������� 
		tc.setCellValueFactory( new PropertyValueFactory<>("bno"));
		
		tc = tableview.getColumns().get(1); // �ι�° �ʵ� �������� 
		tc.setCellValueFactory( new PropertyValueFactory<>("btitle"));
		
		tc = tableview.getColumns().get(2); // �׹�° �ʵ� �������� 
		tc.setCellValueFactory( new PropertyValueFactory<>("bwriter"));
		
		tc = tableview.getColumns().get(3); // �ټ���° �ʵ� �������� 
		tc.setCellValueFactory( new PropertyValueFactory<>("bdate"));
		
		tc = tableview.getColumns().get(4); // ������° �ʵ� �������� 
		tc.setCellValueFactory( new PropertyValueFactory<>("bcount"));
		
		// ���̺� ����Ʈ �־��ֱ�  = setitems( observablelist ��ü )
		tableview.setItems(boards); 
		
		// ���̺� �� Ŭ�������� �̺�Ʈ 
			// tableview.setOnMouseClicked(  (MouseEvent evnet) -> {  �����ڵ� } );
		tableview.setOnMouseClicked( (MouseEvent event ) -> {
			
			if( event.getButton().equals( MouseButton.PRIMARY) ) {
				// selectionmodel : ���õ� �׸� 
				board =  tableview.getSelectionModel().getSelectedItem();
				board.setBcount( board.getBcount()+1 );
				// ��ȸ�� ���� �޼ҵ�
				boardDao.addcount(board);
			
				// ȭ�� ��ȯ 
				MainController.getinstance().loadpage("boardview");
			

			}
		} );
	}
	
	
	

}

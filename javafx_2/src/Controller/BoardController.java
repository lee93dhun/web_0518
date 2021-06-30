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
	

    @FXML
    private TableView<Board> tableview;
    		// tableviw : 리스트 저장 [ ObservableList ]
    		//  <  > : 제네릭 => 테이블에 담을 클래스명 
    @FXML
    private Button btnwrite;

    @FXML
    void write(ActionEvent event) {
    	// 쓰기 버튼을 눌렀을때 => 화면전환 
    	MainController.getinstance().loadpage("boardwrite");
    }
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		// 1. DAO 객체 생성 
		BoardDao boardDao = BoardDao.getBoardDao();
		// 2. DAO 메소드 실행 
		ObservableList<Board> boards = boardDao.allboard();
	
		// 각 열에 값 넣기
		TableColumn tc = tableview.getColumns().get(0); // 첫번째 필드 가져오기 
		tc.setCellValueFactory( new PropertyValueFactory<>("bno"));
		
		tc = tableview.getColumns().get(1); // 두번째 필드 가져오기 
		tc.setCellValueFactory( new PropertyValueFactory<>("btitle"));
		
		tc = tableview.getColumns().get(2); // 네번째 필드 가져오기 
		tc.setCellValueFactory( new PropertyValueFactory<>("bwriter"));
		
		tc = tableview.getColumns().get(3); // 다섯번째 필드 가져오기 
		tc.setCellValueFactory( new PropertyValueFactory<>("bdate"));
		
		tc = tableview.getColumns().get(4); // 여섯번째 필드 가져오기 
		tc.setCellValueFactory( new PropertyValueFactory<>("bcount"));
		
		// 테이블에 리스트 넣어주기  = setitems( observablelist 객체 )
		tableview.setItems(boards); 
		
		// 테이블에 행 클릭했을때 이벤트 
			// tableview.setOnMouseClicked(  (MouseEvent evnet) -> {  실행코드 } );
		tableview.setOnMouseClicked( (MouseEvent event ) -> {
			
			if( event.getButton().equals( MouseButton.PRIMARY) ) {
				// selectionmodel : 선택된 항목 
				System.out.println( tableview.getSelectionModel().getSelectedItem() );
				// 화면 전환 
			}
		} );

	}
	
	
	

}

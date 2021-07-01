package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class PaddController implements Initializable {
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
    @FXML
    private TextField txtpname;

    @FXML
    private TextArea txtpcontents;

    @FXML
    private TextField txtpprice;

    @FXML
    private TextField txtstock;

    @FXML
    private Button btnpadd;

    @FXML
    private RadioButton opt_1;

    @FXML
    private ToggleGroup category;

    @FXML
    private RadioButton opt_2;

    @FXML
    private RadioButton opt_3;

    @FXML
    private RadioButton opt_4;

    @FXML
    void padd(ActionEvent event) { // 등록 버튼을 눌렀을때 
    	
    	String pname = txtpname.getText();
    	String pcontents = txtpcontents.getText();
    	int pprice = txtpprice.getText();
    	int pstock = txtstock.getText();
    	
    	String pcategory ;
    	
    	// 카테고리 
    	if( opt_1.isSelected()  )  pcategory = "의류";
    	if( opt_2.isSelected()  )  pcategory = "신발";
    	if( opt_3.isSelected()  )  pcategory = "악세사리";
    	if( opt_4.isSelected()  )  pcategory = "기타";
    	
    	// 제어 
    		// 1. 동일한 제품명 x
    	
    		// 2. 제품명 3~10글자 이내로 제어 
    	
    		// 3. 제품가격/재고 에 문자일경우 제어 => int 형으로 변환  
    	
    		// 4. 선택된 카테고리 텍스트 넣기 => 버튼명.isSelected()
    	
    		// 5. 5개중 하나라도 공백이면 X
    	
    	// 제어 모두 통과하면 db에 저장 
    	
    	
    	
    
    }
	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	
	

}

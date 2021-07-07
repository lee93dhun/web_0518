package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class AdminHomeController implements Initializable{
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	@FXML
    private Button btnadd;

    @FXML
    private TextField txttitle;

    @FXML
    private TextField txtrating;

    @FXML
    private TextField txtgenre;

    @FXML
    private TextField txtoutline;

    @FXML
    private TextField txtrelease;

    @FXML
    private TextField txtprice;

    @FXML
    private Button btnimgupload;

    @FXML
    private Label txtpath;

    @FXML
    private ImageView imgposter;

    @FXML
    void add(ActionEvent event) {

    }

    @FXML
    void imgupload(ActionEvent event) {

    }

}

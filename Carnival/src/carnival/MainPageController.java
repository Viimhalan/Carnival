package carnival;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MainPageController implements Initializable {

    @FXML
    private Button iceCreamStall;
    @FXML
    private Pane pointsPane;
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    @FXML
    public void iceCreamStall_Clicked(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("IceCreamStall.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    
}

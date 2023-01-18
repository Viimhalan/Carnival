package carnival;

import carnival.fortuneWeighingScale.FortuneWeighingScale;
import carnival.fortuneWeighingScale.NoPennyState;
import carnival.fortuneWeighingScale.HasPennyState;
import carnival.fortuneWeighingScale.State;
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
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class WeighingScalePageController implements Initializable {

    
    @FXML
    private Button nextButton;
    
    @FXML
    private Button scaleBtn_Clicked;
    
    @FXML
    public Button insertPenny_Clicked;
    
    @FXML
    public Button ejectPenny_Clicked;
    
    @FXML
    public Button pressButton_Clicked;
    
    @FXML
    public Button turnCrank_Clicked;
    
    @FXML
    public Label hasInsert;
    
    @FXML
    public Label welcomeMsg;
    
    @FXML
    public Label startMsg;
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    @FXML
    public void nextButton_Clicked(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    public void scaleBtn_Clicked(ActionEvent event) throws IOException{
        startMsg.setVisible(true);
        welcomeMsg.setVisible(false);
    }
    
    FortuneWeighingScale fortuneWeighingScale = new FortuneWeighingScale(5);
    
    @FXML
    public void insertPenny_Clicked(ActionEvent event) throws IOException{
        State currentState = fortuneWeighingScale.getState();
        System.out.println(currentState);
        fortuneWeighingScale.insertPenny();
        if(fortuneWeighingScale.getState().equals("")){
            System.out.println("");
            hasInsert.setVisible(true);
        }
    }
    
    @FXML
    public void ejectPenny_Clicked(ActionEvent event) throws IOException{
        fortuneWeighingScale.ejectPenny();
    }
    
    @FXML
    public void pressButton_Clicked(ActionEvent event) throws IOException{
        fortuneWeighingScale.pressButton();
    }
    
    @FXML
    public void turnCrank_Clicked(ActionEvent event) throws IOException{
        fortuneWeighingScale.turnCrank();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

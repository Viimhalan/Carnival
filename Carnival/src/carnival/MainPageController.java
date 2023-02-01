package carnival;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainPageController implements Initializable {
    @FXML private Label score;
    @FXML private Button iceCreamStall;
    @FXML private Button teaterBooth;
    @FXML private Button exit;
    private Pane pointsPane;
    private Stage stage;
    private Scene scene;
    private Parent root;

    
    @FXML
    public void iceCreamStall_Clicked(ActionEvent event) throws IOException{
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Entry Access Denied!");
        alert.setContentText("Sorry. You have insufficient points!");
        Scoreboard scoreboard=Scoreboard.getInstance();
        int points=scoreboard.getScore();
        if (points>10) {
            root = FXMLLoader.load(getClass().getResource("IceCreamStall.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        }
        else{
            alert.showAndWait();

        }
    }
    
    @FXML
    public void theaterBooth_Clicked(ActionEvent event) throws IOException{
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Entry Access Denied!");
        alert.setContentText("Sorry. You have insufficient points!");
        Scoreboard scoreboard=Scoreboard.getInstance();
        int points=scoreboard.getScore();
        if (points>10) {
            root = FXMLLoader.load(getClass().getResource("Theater.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        }
        else{
            alert.showAndWait();

        }
    }
    
    @FXML
    public void foodStall_Clicked(ActionEvent event) throws IOException{
        Alert alert = new Alert(Alert.AlertType.INFORMATION); // setting up the alert message box
        alert.setTitle("Entry Access Denied!"); // setting up the alert message object
        alert.setContentText("Sorry. You have insufficient points!"); // setting up the alert message box
        Scoreboard scoreboard=Scoreboard.getInstance(); // get scoreboard
        int points=scoreboard.getScore();// get points
        if (points>10) {   // check if current points is greater than minimum.Right now it is set to 10
            root = FXMLLoader.load(getClass().getResource("FoodStall.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        }
        else{   // if points is less than or equal to minimum show the alert message box
            alert.showAndWait();

        }

    }
    
    @FXML
    public void exitButton_Clicked(ActionEvent event) throws IOException{
        score.setText("POINTS: 0");
        root = FXMLLoader.load(getClass().getResource("WelcomePage.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Scoreboard scoreboard=Scoreboard.getInstance();
        score.setText("POINTS: " + String.valueOf(scoreboard.getScore()));
    }    
    
}

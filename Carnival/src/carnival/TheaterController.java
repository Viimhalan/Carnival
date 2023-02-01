/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package carnival;

import carnival.Theater.CarnivalFacade;
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
import javafx.scene.control.TextField;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author user
 */
public class TheaterController implements Initializable {
    @FXML Label score;
    @FXML
    private Label welcome;
    
    @FXML
    private Label buyTicket;
    
    @FXML
    private Button setYes;
    
    @FXML
    private Button setNo;
    
    @FXML
    private Label popcorn;
    
    @FXML
    private Label popcorn1;
    
    @FXML
    private Button setYes1;
    
    @FXML
    private Button setNo1;
    
    @FXML
    private Button royale;
    
    @FXML
    private Button caramel;
    
    @FXML
    private Button fries;
    
    @FXML
    private Button nuggets;
    
    @FXML
    private Label writeRoyale;
    
    @FXML
    private Label writeCaramel;
    
    @FXML
    private Label writeFries;
    
    @FXML
    private Label writeNuggets;
  
    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    @FXML
    public void clickYes(ActionEvent event) {
        popcorn.setVisible(true);
        popcorn1.setVisible(false);
        setYes1.setVisible(true);
        setNo1.setVisible(true);
        buyTicket.setVisible(false);
        setYes.setVisible(false);
        setNo.setVisible(false);
        royale.setVisible(false);
        caramel.setVisible(false);
        fries.setVisible(false);
        nuggets.setVisible(false);
        writeFries.setVisible(false);
        writeNuggets.setVisible(false);
        Scoreboard scoreboard=Scoreboard.getInstance();
        scoreboard.deductScore(10);
        score.setText(String.valueOf(scoreboard.getScore()));
    }

    @FXML
    public void clickNo(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }
    
    public void yesClicked(ActionEvent event) throws IOException {
        popcorn.setVisible(false);
        setYes1.setVisible(false);
        setNo1.setVisible(false);
        popcorn1.setVisible(true);
        royale.setVisible(true);
        caramel.setVisible(true);
        writeRoyale.setVisible(true);
        writeCaramel.setVisible(true);
        fries.setVisible(true);
        nuggets.setVisible(true);
        writeFries.setVisible(true);
        writeNuggets.setVisible(true);
    }
    
    public void noClicked(ActionEvent event) throws IOException {
//        popcorn.setVisible(false);
//        setYes1.setVisible(false);
//        setNo1.setVisible(false);
//        royale.setVisible(false);
//        caramel.setVisible(false);
//        writeRoyale.setVisible(false);
//        writeCaramel.setVisible(false);
//        popcorn1.setVisible(false);
//        fries.setVisible(false);
//        nuggets.setVisible(false);
//        writeFries.setVisible(false);
//        writeNuggets.setVisible(false);
        root = FXMLLoader.load(getClass().getResource("Movie.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }
    
    public void clickRoyale(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Movie.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();  
    }
    
    public void clickCaramel(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Movie.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }
    
    public void clickFries(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Movie.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }
    
    public void clickNuggets(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Movie.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Scoreboard scoreboard=Scoreboard.getInstance();
        score.setText(String.valueOf(scoreboard.getScore()));
    }    
    
}

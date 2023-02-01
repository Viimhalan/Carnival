/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package carnival;

import carnival.Theater.CarnivalFacade;
import carnival.Theater.Film;
import carnival.Theater.Projector;
import carnival.Theater.Screen;
import carnival.Theater.Speaker;
import carnival.Theater.TheaterLights;
import carnival.Theater.User;
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
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author user
 */
public class MovieController implements Initializable {
    
    @FXML
    private MediaView mv1;
    
    @FXML
    private Label facade;
    
    @FXML
    private Button start;
    
    @FXML
    private Button end;
    
    @FXML
    private Button exit;
    
    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    Film dvd = new Film();
    Projector projector = new Projector();
    Screen screen1 = new Screen();
    TheaterLights lights = new TheaterLights();
    User user = new User();
    Speaker speaker = new Speaker(dvd);

    CarnivalFacade homeTheater = new CarnivalFacade(speaker,dvd,projector,lights,screen1,user);
    
    @Override
    public void initialize(URL url, ResourceBundle rb) { 
        facade.setVisible(true);
        facade.setText(homeTheater.watchMovie("Jurassic World"));
    }
    
    public void trailer(ActionEvent event) throws IOException {
        facade.setVisible(false);
        start.setVisible(false);
        exit.setVisible(false);
        end.setVisible(true);
        URL video = MovieController.class.getResource("Trailer_Trim.mp4");
        Media media = new Media(video.toExternalForm());
        MediaPlayer mediaplayer = new MediaPlayer(media);
        mv1.setMediaPlayer(mediaplayer);
        mediaplayer.setAutoPlay(true); 
        mediaplayer.setStopTime(Duration.millis(10000.0));
    }
    
    public void endTrailer(ActionEvent event) throws IOException {
        facade.setVisible(true);
        start.setVisible(false);
        end.setVisible(false);
        mv1.setVisible(false);
        exit.setVisible(true);
        
        facade.setText(homeTheater.endMovie());   
    }
    
    public void exit(ActionEvent event) throws IOException {
        facade.setVisible(false);
        start.setVisible(false);
        end.setVisible(false);
        mv1.setVisible(false);
        exit.setVisible(false);
        root = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();   
    }
}

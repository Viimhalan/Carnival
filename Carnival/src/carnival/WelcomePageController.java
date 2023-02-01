package carnival;

import java.io.File;
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
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class WelcomePageController implements Initializable {
    
    @FXML
    private Button enterButton;
    @FXML
    private MediaView mv;
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    @FXML
    public void enterButton_Clicked(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("WeighingScalePage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        URL video = WelcomePageController.class.getResource("Carnival.mp4");
        Media media = new Media(video.toExternalForm());
        MediaPlayer mediaplayer = new MediaPlayer(media);
        mv.setMediaPlayer(mediaplayer);
        mediaplayer.setAutoPlay(true);    
    }    
    
}

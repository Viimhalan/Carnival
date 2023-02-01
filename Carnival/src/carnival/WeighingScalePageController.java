package carnival;

import carnival.fortuneWeighingScale.DisplayWeightState;
import carnival.fortuneWeighingScale.FortuneWeighingScale;
import carnival.fortuneWeighingScale.NoPennyState;
import carnival.fortuneWeighingScale.HasPennyState;
import carnival.fortuneWeighingScale.LuckyState;
import carnival.fortuneWeighingScale.MessageDroppedState;
import carnival.fortuneWeighingScale.MessageFinishedState;
import carnival.fortuneWeighingScale.State;
import java.io.IOException;
import java.net.URL;
import java.util.Random;
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
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class WeighingScalePageController implements Initializable {

    @FXML private Label pointsLabel;
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
    public Label msg;
    
    @FXML
    public Label ageLabel;
    
    @FXML
    public Label welcomeMsg;
    
    @FXML
    public Label startMsg;
    
    @FXML
    public Text fortune;
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    @FXML
    public void nextButton_Clicked(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }
    
    @FXML
    public void scaleBtn_Clicked(ActionEvent event) throws IOException{
        if(welcomeMsg.isVisible()){
            welcomeMsg.setVisible(false);
            startMsg.setVisible(true);
        }
        else if(startMsg.isVisible()){
            startMsg.setVisible(false);
            welcomeMsg.setVisible(true);
        }
        
    }
    
    FortuneWeighingScale fortuneWeighingScale = new FortuneWeighingScale(10);
    
    @FXML
    public void insertPenny_Clicked(ActionEvent event) throws IOException{
//        fortuneWeighingScale.insertPenny(); 
        
        welcomeMsg.setVisible(false);
        startMsg.setVisible(false);
        msg.setText(fortuneWeighingScale.insertPenny());
        fortune.setVisible(false);
        msg.setVisible(true);
    }
    
    @FXML
    public void ejectPenny_Clicked(ActionEvent event) throws IOException{
//        fortuneWeighingScale.ejectPenny();
        
        welcomeMsg.setVisible(false);
        startMsg.setVisible(false);
        msg.setText(fortuneWeighingScale.ejectPenny());
        fortune.setVisible(false);
        msg.setVisible(true);
    }
    
    @FXML
    public void pressButton_Clicked(ActionEvent event) throws IOException{
//        fortuneWeighingScale.pressButton();

        State currentState = fortuneWeighingScale.getState();
        String crntState = currentState.toString();
        
        HasPennyState hasPenny = new HasPennyState(fortuneWeighingScale);
        String hasPennyState = hasPenny.toString();
         
        if(crntState.equals(hasPennyState)){
            Random randomAge = new Random();
            int age = randomAge.nextInt(100-50)+50;
            ageLabel.setText(" "+ String.valueOf(age)+" kg");
            nextButton.setVisible(true);
            Scoreboard scoreboard=Scoreboard.getInstance();

            scoreboard.setScore(age);
            pointsLabel.setText(String.valueOf(scoreboard.getScore()));
        }
        
        welcomeMsg.setVisible(false);
        startMsg.setVisible(false);
        msg.setText(fortuneWeighingScale.pressButton());
        fortune.setVisible(false);
        msg.setVisible(true);

    }
    
    @FXML
    public void turnCrank_Clicked(ActionEvent event) throws IOException{
//        fortuneWeighingScale.turnCrank();
        Random r = new Random();
        String[] ft = {"A beautiful, smart, and loving person will be coming into your life."
                           ,"Believe in yourself and others will too."
                           ,"Curiosity kills boredom. Nothing can kill curiosity."
                           ,"Do not demand for someone’s soul if you already got his heart."
                           ,"Every flower blooms in its own sweet time."
                           ,"From now on your kindness will lead you to success."
                           ,"Happiness begins with facing life with a smile and a wink."
                           ,"Imagination rules the world."
                           ,"Listen to everyone. Ideas come from everywhere."
                           ,"Nothing is more difficult, and therefore more precious, than to be able to decide."
                           ,"Perhaps you’ve been focusing too much on saving."
                           ,"Rest has a peaceful effect on your physical and emotional health."
                           ,"Society prepares the crime; the criminal commits it."
                           ,"Technology is the art of arranging the world so we do not notice it."};
        
        int i = r.nextInt(14);
        welcomeMsg.setVisible(false);
        startMsg.setVisible(false);
        msg.setText(fortuneWeighingScale.turnCrank());
        fortune.setVisible(true);
        fortune.setText(ft[i]);
        msg.setVisible(true);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

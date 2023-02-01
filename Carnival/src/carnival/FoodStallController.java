package carnival;

import carnival.FoodStall.Food;
import carnival.FoodStall.FoodStall;
import carnival.Scoreboard;
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
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class FoodStallController implements Initializable {
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML private Label score;
    @FXML private Pane orderPane;
    @FXML private Button no; 
    @FXML private Label checkoutLabel; 
    @FXML private Pane checkoutPane; 
    @FXML private Text invalidChoice; 
    @FXML private Button yes; 
    @FXML private Label orderLabel; 
    @FXML private ImageView bag; 
    @FXML private Button checkout; 
    @FXML private TextField order;
    
    void checkout(){
        checkoutPane.setVisible(true);
        bag.setVisible(true);
        checkoutLabel.setVisible(true);
        order.clear();
        invalidChoice.setVisible(false);
        orderLabel.setVisible(false);
        orderPane.setVisible(false);
    }
    
    void order(){
        checkoutPane.setVisible(false);
        bag.setVisible(false);
        checkoutLabel.setVisible(false);
        orderLabel.setVisible(true);
        orderPane.setVisible(true);
    }
    
    @FXML 
    public void checkoutButton_Clicked(ActionEvent event) {
        Scoreboard scoreboard=Scoreboard.getInstance();
        if(order.getText().equalsIgnoreCase("Burger")){
            FoodStall burger = new FoodStall();

            Food food = burger.orderFood("burger");
            System.out.println("Ordered a " + food );
            scoreboard.deductScore(5);
            score.setText("POINTS: " + String.valueOf(scoreboard.getScore()));
            checkout();
        }
        else if(order.getText().equalsIgnoreCase("Hotdog")){
            FoodStall hotdog = new FoodStall();

            Food food2 = hotdog.orderFood("hotdog");
            System.out.println("Ordered a " + food2 );
            scoreboard.deductScore(3);
            score.setText("POINTS: " + String.valueOf(scoreboard.getScore()));
            checkout();
        }
        else if(order.getText().equalsIgnoreCase("Sandwich")){
            FoodStall sandwich = new FoodStall();
            
            Food food1 = sandwich.orderFood("sandwich");
            System.out.println("Ordered a " + food1 );
            scoreboard.deductScore(4);
            score.setText("POINTS: " + String.valueOf(scoreboard.getScore()));
            checkout();
        }
        else{
            invalidChoice.setVisible(true);
        }
    }

    @FXML
    public void yesButton_Clicked(ActionEvent event) {
        order();
    }

    @FXML
    public void noButton_Clicked(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
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

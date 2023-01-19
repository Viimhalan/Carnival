package carnival;

import carnival.IceCreamStall.Chocolate;
import carnival.IceCreamStall.ChocolateChips;
import carnival.IceCreamStall.ChocolateSauce;
import carnival.IceCreamStall.Cone;
import carnival.IceCreamStall.Cup;
import carnival.IceCreamStall.IceCream;
import carnival.IceCreamStall.NutSauce;
import carnival.IceCreamStall.Nuts;
import carnival.IceCreamStall.Sprinkles;
import carnival.IceCreamStall.Strawberry;
import carnival.IceCreamStall.StrawberrySauce;
import carnival.IceCreamStall.Vanilla;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class IceCreamStallController implements Initializable {
    @FXML private ImageView chocolateSauce; 
    @FXML private ImageView chocolateChips; 
    @FXML private Label orderLabel; 
    @FXML private Label toppingLabel;
    @FXML private Pane menuPane; 
    @FXML private CheckBox nutsBox;  
    @FXML private CheckBox sprinklesBox;  
    @FXML private CheckBox chocolateChipsBox; 
    @FXML private ImageView cone; 
    @FXML private TextField orderBill; 
    @FXML private ImageView nutSauce; 
    @FXML private Label containerLabel; 
    @FXML private ImageView sprinkles; 
    @FXML private Button nextFlavour; 
    @FXML private Button nextContainer; 
    @FXML private Button nextSauce;
    @FXML private TextField flavourBox;
    @FXML private TextField containerBox;
    @FXML private TextField sauceBox;
    @FXML private Button checkout;
    @FXML private Button yes; 
    @FXML private ImageView vanilla; 
    @FXML private Label flavourLabel;
    @FXML private ImageView strawberry;
    @FXML private Pane flavourPane; 
    @FXML private Pane containerPane; 
    @FXML private Pane saucePane; 
    @FXML private Pane toppingPane; 
    @FXML private ImageView berrySauce; 
    @FXML private Pane orderPane; 
    @FXML private ImageView nuts; 
    @FXML private Label sauceLabel; 
    @FXML private ImageView cup; 
    @FXML private ImageView chocolate;
    @FXML private Pane iceCreamPane;
    @FXML private Text invalidFlavour;
    @FXML private Text invalidContainer;
    @FXML private Text invalidSauce;
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    @FXML
    void yes_Clicked(ActionEvent event) {
        orderLabel.setVisible(false);
        orderPane.setVisible(false);
        flavourLabel.setVisible(true);
        flavourPane.setVisible(true);
    }

    @FXML
    void no_Clicked(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void vanilla_Clicked(ActionEvent event) {
        flavourLabel.setVisible(false);
        flavourPane.setVisible(false);
        containerLabel.setVisible(true);
        containerPane.setVisible(true);
        orderVanilla();
    } 

    @FXML
    void strawberry_Clicked(ActionEvent event) {
        flavourLabel.setVisible(false);
        flavourPane.setVisible(false);
        containerLabel.setVisible(true);
        containerPane.setVisible(true);
        orderStrawberry();
    }

    @FXML
    void chocolate_Clicked(ActionEvent event) {
        IceCream order = new Chocolate();
        flavourLabel.setVisible(false);
        flavourPane.setVisible(false);
        containerLabel.setVisible(true);
        containerPane.setVisible(true);
        orderChocolate();
    }

    @FXML
    void cup_Clicked(ActionEvent event) {
        containerLabel.setVisible(false);
        containerPane.setVisible(false);
        toppingLabel.setVisible(true);
        toppingPane.setVisible(true);;
    }

    @FXML
    void cone_Clicked(ActionEvent event) {
        containerLabel.setVisible(false);
        containerPane.setVisible(false);
        toppingLabel.setVisible(true);
        toppingPane.setVisible(true);
        if(vanilla.isArmed()){
            orderVanilla();
        }
        else if(strawberry.isArmed()){
            orderStrawberry();
        }
        else if(chocolate.isArmed()){
            orderChocolate();    
        }
    }

    @FXML
    void nuts_Clicked(ActionEvent event) {
        if(vanilla.isArmed()){
            orderVanilla();
        }
        else if(strawberry.isArmed()){
            orderStrawberry();
        }
        else if(chocolate.isArmed()){
            orderChocolate();    
        }
    }

    @FXML
    void sprinkles_Clicked(ActionEvent event) {
        if(vanilla.isArmed()){
            orderVanilla();
        }
        else if(strawberry.isArmed()){
            orderStrawberry();
        }
        else if(chocolate.isArmed()){
            orderChocolate();    
        }
    }

    @FXML
    void chocolateChips_Clicked(ActionEvent event) {
        if(vanilla.isArmed()){
            orderVanilla();
        }
        else if(strawberry.isArmed()){
            orderStrawberry();
        }
        else if(chocolate.isArmed()){
            orderChocolate();    
        }
    }

    @FXML
    void chocolateSauce_Clicked(ActionEvent event) {
        if(vanilla.isArmed()){
            orderVanilla();
        }
        else if(strawberry.isArmed()){
            orderStrawberry();
        }
        else if(chocolate.isArmed()){
            orderChocolate();    
        }
    }

    @FXML
    void berrySauce_Clicked(ActionEvent event) {
        if(vanilla.isArmed()){
            orderVanilla();
        }
        else if(strawberry.isArmed()){
            orderStrawberry();
        }
        else if(chocolate.isArmed()){
            orderChocolate();    
        }
    }

    @FXML
    void nutSauce_Clicked(ActionEvent event) {
        if(vanilla.isArmed()){
            orderVanilla();
        }
        else if(strawberry.isArmed()){
            orderStrawberry();
        }
        else if(chocolate.isArmed()){
            orderChocolate();    
        }
    }
    
    @FXML
    void checkout_Clicked(ActionEvent event) {
        toppingLabel.setVisible(false);
        toppingPane.setVisible(false);
        orderLabel.setVisible(true);
        orderPane.setVisible(true);
        orderBill.setVisible(true);
        
    }
    
    void orderVanilla(){
        if(vanilla.isArmed() == true){
            IceCream order = new Vanilla();
            System.out.println(order.getDescription());
            if(cup.isArmed() == true){
                order = new Cup(order);
                System.out.println(order.getDescription());
                if(nuts.isArmed() == true){
                    order = new Nuts(order);
                    System.out.println(order.getDescription());
                }
                if(sprinkles.isArmed() == true){
                    order = new Sprinkles(order);
                    System.out.println(order.getDescription());
                }
                if(chocolateChips.isArmed() == true){
                    order = new ChocolateChips(order);
                    System.out.println(order.getDescription());
                }
                if(chocolateSauce.isArmed() == true){
                    order = new ChocolateSauce(order);
                    System.out.println(order.getDescription());
                }
                if(berrySauce.isArmed() == true){
                    order = new StrawberrySauce(order);
                    System.out.println(order.getDescription());
                }
                if(nutSauce.isArmed() == true){
                    order = new NutSauce(order);
                    System.out.println(order.getDescription());
                }
                if(checkout.isArmed() == true){
                    System.out.println(order.getDescription());
                }
            }
            else if(cone.isArmed()){
                order = new Cone(order);
                System.out.println(order.getDescription());
                if(nuts.isArmed() == true){
                    order = new Nuts(order);
                    System.out.println(order.getDescription());
                }
                if(sprinkles.isArmed() == true){
                    order = new Sprinkles(order);
                    System.out.println(order.getDescription());
                }
                if(chocolateChips.isArmed() == true){
                    order = new ChocolateChips(order);
                    System.out.println(order.getDescription());
                }
                if(chocolateSauce.isArmed() == true){
                    order = new ChocolateSauce(order);
                    System.out.println(order.getDescription());
                }
                if(berrySauce.isArmed() == true){
                    order = new StrawberrySauce(order);
                    System.out.println(order.getDescription());
                }
                if(nutSauce.isArmed() == true){
                    order = new NutSauce(order);
                    System.out.println(order.getDescription());
                }
                if(checkout.isArmed() == true){
                    System.out.println(order.getDescription());
                }
            }
        }
    }
    
    void orderChocolate(){
        if(chocolate.isArmed() == true){
            IceCream order = new Chocolate();
            System.out.println(order.getDescription());
            if(cup.isArmed() == true){
                order = new Cup(order);
                System.out.println(order.getDescription());
                if(nuts.isArmed() == true){
                    order = new Nuts(order);
                    System.out.println(order.getDescription());
                }
                if(sprinkles.isArmed() == true){
                    order = new Sprinkles(order);
                    System.out.println(order.getDescription());
                }
                if(chocolateChips.isArmed() == true){
                    order = new ChocolateChips(order);
                    System.out.println(order.getDescription());
                }
                if(chocolateSauce.isArmed() == true){
                    order = new ChocolateSauce(order);
                    System.out.println(order.getDescription());
                }
                if(berrySauce.isArmed() == true){
                    order = new StrawberrySauce(order);
                    System.out.println(order.getDescription());
                }
                if(nutSauce.isArmed() == true){
                    order = new NutSauce(order);
                    System.out.println(order.getDescription());
                }
                if(checkout.isArmed() == true){
                    System.out.println(order.getDescription());
                }
            }
            else if(cone.isArmed()){
                order = new Cone(order);
                System.out.println(order.getDescription());
                if(nuts.isArmed() == true){
                    order = new Nuts(order);
                    System.out.println(order.getDescription());
                }
                if(sprinkles.isArmed() == true){
                    order = new Sprinkles(order);
                    System.out.println(order.getDescription());
                }
                if(chocolateChips.isArmed() == true){
                    order = new ChocolateChips(order);
                    System.out.println(order.getDescription());
                }
                if(chocolateSauce.isArmed() == true){
                    order = new ChocolateSauce(order);
                    System.out.println(order.getDescription());
                }
                if(berrySauce.isArmed() == true){
                    order = new StrawberrySauce(order);
                    System.out.println(order.getDescription());
                }
                if(nutSauce.isArmed() == true){
                    order = new NutSauce(order);
                    System.out.println(order.getDescription());
                }
                if(checkout.isArmed() == true){
                    System.out.println(order.getDescription());
                }
            }
        }
    }
    
    void orderStrawberry(){
        if(strawberry.isArmed() == true){
            IceCream order = new Strawberry();
            System.out.println(order.getDescription());
            if(cup.isArmed() == true){
                order = new Cup(order);
                System.out.println(order.getDescription());
                if(nuts.isArmed() == true){
                    order = new Nuts(order);
                    System.out.println(order.getDescription());
                }
                if(sprinkles.isArmed() == true){
                    order = new Sprinkles(order);
                    System.out.println(order.getDescription());
                }
                if(chocolateChips.isArmed() == true){
                    order = new ChocolateChips(order);
                    System.out.println(order.getDescription());
                }
                if(chocolateSauce.isArmed() == true){
                    order = new ChocolateSauce(order);
                    System.out.println(order.getDescription());
                }
                if(berrySauce.isArmed() == true){
                    order = new StrawberrySauce(order);
                    System.out.println(order.getDescription());
                }
                if(nutSauce.isArmed() == true){
                    order = new NutSauce(order);
                    System.out.println(order.getDescription());
                }
                if(checkout.isArmed() == true){
                    System.out.println(order.getDescription());
                }
            }
            else if(cone.isArmed()){
                order = new Cone(order);
                System.out.println(order.getDescription());
                if(nuts.isArmed() == true){
                    order = new Nuts(order);
                    System.out.println(order.getDescription());
                }
                if(sprinkles.isArmed() == true){
                    order = new Sprinkles(order);
                    System.out.println(order.getDescription());
                }
                if(chocolateChips.isArmed() == true){
                    order = new ChocolateChips(order);
                    System.out.println(order.getDescription());
                }
                if(chocolateSauce.isArmed() == true){
                    order = new ChocolateSauce(order);
                    System.out.println(order.getDescription());
                }
                if(berrySauce.isArmed() == true){
                    order = new StrawberrySauce(order);
                    System.out.println(order.getDescription());
                }
                if(nutSauce.isArmed() == true){
                    order = new NutSauce(order);
                    System.out.println(order.getDescription());
                }
                if(checkout.isArmed() == true){
                    System.out.println(order.getDescription());
                }
            }
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}

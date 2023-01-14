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
 
    @FXML private Label flavourLabel; 
    @FXML private Button no; 
    @FXML private Button chocolateSauce; 
    @FXML private Pane flavourPane; 
    @FXML private Button yes; 
    @FXML private Button chocolateChips; 
    @FXML private Label orderLabel; 
    @FXML private Button strawberry; 
    @FXML private Button cone; 
    @FXML private Label toppingLabel; 
    @FXML private Pane toppingPane; 
    @FXML private Button berrySauce; 
    @FXML private Pane orderPane; 
    @FXML private Pane containerPane; 
    @FXML private TextArea orderBill; 
    @FXML private Button nuts; 
    @FXML private Button nutSauce; 
    @FXML private Label containerLabel; 
    @FXML private Button sprinkles; 
    @FXML private Button checkout; 
    @FXML private Button vanilla; 
    @FXML private Button chocolate; 
    @FXML  private Button cup;
    private Stage stage;
    private Scene scene;
    private Parent root;
//    private boolean vanillaClicked = vanilla.isArmed();
//    private boolean strawberryClicked = strawberry.isArmed();
//    private boolean chocolateClicked = chocolate.isArmed();
//    private boolean cupClicked = cup.isArmed();
//    private boolean coneClicked = cone.isArmed();
//    private boolean nutsClicked = nuts.isArmed();
//    private boolean sprinklesClicked = sprinkles.isArmed();
//    private boolean chocolateChipsClicked = chocolateChips.isArmed();
//    private boolean chocolateSauceClicked = chocolateSauce.isArmed();
//    private boolean berrySauceClicked = berrySauce.isArmed();
//    private boolean nutSauceClicked = nutSauce.isArmed();
//    private boolean checkoutClicked = checkout.isArmed();
    
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
    
    void container(){
        flavourLabel.setVisible(false);
        flavourPane.setVisible(false);
        containerLabel.setVisible(true);
        containerPane.setVisible(true);
    }
    
    void topping(){
        containerLabel.setVisible(false);
        containerPane.setVisible(false);
        toppingLabel.setVisible(true);
        toppingPane.setVisible(true);
    }
    
    void order(){
        toppingLabel.setVisible(false);
        toppingPane.setVisible(false);
        orderLabel.setVisible(true);
        orderPane.setVisible(true);
        orderBill.setVisible(true);
    }
    
    @FXML
    boolean vanilla_Clicked(ActionEvent event) {
        IceCream order = new Vanilla();
        container();
        return true;
    }
    
    @FXML
    boolean strawberry_Clicked(ActionEvent event) {
        IceCream order = new Strawberry();
        container();
        return true;
    }

    @FXML
    boolean chocolate_Clicked(ActionEvent event) {
        IceCream order = new Chocolate();
        container();
        return true;
    }

    @FXML
    boolean cup_Clicked(ActionEvent event) {
        if(vanilla_Clicked(event) == true){
            IceCream order = new Vanilla();
            order = new Cup(order);
            topping();
        }
        else if(strawberry_Clicked(event) == true){
            IceCream order = new Vanilla();
            order = new Cup(order);
            topping();
        }
        else if(chocolate_Clicked(event) == true){
            IceCream order = new Vanilla();
            order = new Cup(order);
            topping();
        }
        return true;
    }

    @FXML
    boolean cone_Clicked(ActionEvent event) {
        if(vanilla_Clicked(event) == true){
            IceCream order = new Vanilla();
            order = new Cone(order);
            topping();
        }
        else if(strawberry_Clicked(event) == true){
            IceCream order = new Vanilla();
            order = new Cone(order);
            topping();
        }
        else if(chocolate_Clicked(event) == true){
            IceCream order = new Vanilla();
            order = new Cone(order);
            topping();
        }
        return true;
    }

    @FXML
    boolean nuts_Clicked(ActionEvent event) {
        if(vanilla_Clicked(event) == true){
            IceCream order = new Vanilla();
            if(cup_Clicked(event) == true){
                order = new Cup(order);
                order = new Nuts(order);
            }
            else {
                if (cone_Clicked(event) == true){
                    order = new Cone(order);
                    order = new Nuts(order);
                }
            }
        }
        else if(strawberry_Clicked(event) == true){
            IceCream order = new Vanilla();
            if(cup_Clicked(event) == true){
                order = new Cup(order);
                order = new Nuts(order);
            }
            else if (cone_Clicked(event) == true){
                order = new Cone(order);
                order = new Nuts(order);
            }
        }
        else if(chocolate_Clicked(event) == true){
            IceCream order = new Vanilla();
            if(cup_Clicked(event) == true){
                order = new Cup(order);
                order = new Nuts(order);
            }
            else if (cone_Clicked(event) == true){
                order = new Cone(order);
                order = new Nuts(order);
            }
        }
        nuts.setDisable(true);
        return true;
    }

    @FXML
    boolean sprinkles_Clicked(ActionEvent event) {
        if(vanilla_Clicked(event) == true){
            IceCream order = new Vanilla();
            if(cup_Clicked(event) == true){
                order = new Cup(order);
                order = new Sprinkles(order);
            }
            else if (cone_Clicked(event) == true){
                order = new Cone(order);
                order = new Sprinkles(order);
            }
        }
        else if(strawberry_Clicked(event) == true){
            IceCream order = new Vanilla();
            if(cup_Clicked(event) == true){
                order = new Cup(order);
                order = new Sprinkles(order);
            }
            else if (cone_Clicked(event) == true){
                order = new Cone(order);
                order = new Sprinkles(order);
            }
        }
        else if(chocolate_Clicked(event) == true){
            IceCream order = new Vanilla();
            if(cup_Clicked(event) == true){
                order = new Cup(order);
                order = new Sprinkles(order);
            }
            else if (cone_Clicked(event) == true){
                order = new Cone(order);
                order = new Sprinkles(order);
            }
        }
        sprinkles.setDisable(true);
        return true;
    }

    @FXML
    boolean chocolateChips_Clicked(ActionEvent event) {
        if(vanilla_Clicked(event) == true){
            IceCream order = new Vanilla();
            if(cup_Clicked(event) == true){
                order = new Cup(order);
                order = new ChocolateChips(order);
            }
            else if (cone_Clicked(event) == true){
                order = new Cone(order);
                order = new ChocolateChips(order);
            }
        }
        else if(strawberry_Clicked(event) == true){
            IceCream order = new Vanilla();
            if(cup_Clicked(event) == true){
                order = new Cup(order);
                order = new ChocolateChips(order);
            }
            else if (cone_Clicked(event) == true){
                order = new Cone(order);
                order = new ChocolateChips(order);
            }
        }
        else if(chocolate_Clicked(event) == true){
            IceCream order = new Vanilla();
            if(cup_Clicked(event) == true){
                order = new Cup(order);
                order = new ChocolateChips(order);
            }
            else if (cone_Clicked(event) == true){
                order = new Cone(order);
                order = new ChocolateChips(order);
            }
        }
        chocolateChips.setDisable(true);
        return true;
    }

    @FXML
    boolean chocolateSauce_Clicked(ActionEvent event) {
        if(vanilla_Clicked(event) == true){
            IceCream order = new Vanilla();
            if(cup_Clicked(event) == true){
                order = new Cup(order);
                order = new ChocolateSauce(order);
            }
            else if (cone_Clicked(event) == true){
                order = new Cone(order);
                order = new ChocolateSauce(order);
            }
        }
        else if(strawberry_Clicked(event) == true){
            IceCream order = new Vanilla();
            if(cup_Clicked(event) == true){
                order = new Cup(order);
                order = new ChocolateSauce(order);
            }
            else if (cone_Clicked(event) == true){
                order = new Cone(order);
                order = new ChocolateSauce(order);
            }
        }
        else if(chocolate_Clicked(event) == true){
            IceCream order = new Vanilla();
            if(cup_Clicked(event) == true){
                order = new Cup(order);
                order = new ChocolateSauce(order);
            }
            else if (cone_Clicked(event) == true){
                order = new Cone(order);
                order = new ChocolateSauce(order);
            }
        }
        chocolateSauce.setDisable(true);
        return true;
    }

    @FXML
    boolean berrySauce_Clicked(ActionEvent event) {
        if(vanilla_Clicked(event) == true){
            IceCream order = new Vanilla();
            if(cup_Clicked(event) == true){
                order = new Cup(order);
                order = new StrawberrySauce(order);
            }
            else if (cone_Clicked(event) == true){
                order = new Cone(order);
                order = new StrawberrySauce(order);
            }
        }
        else if(strawberry_Clicked(event) == true){
            IceCream order = new Vanilla();
            if(cup_Clicked(event) == true){
                order = new Cup(order);
                order = new StrawberrySauce(order);
            }
            else if (cone_Clicked(event) == true){
                order = new Cone(order);
                order = new StrawberrySauce(order);
            }
        }
        else if(chocolate_Clicked(event) == true){
            IceCream order = new Vanilla();
            if(cup_Clicked(event) == true){
                order = new Cup(order);
                order = new StrawberrySauce(order);
            }
            else if (cone_Clicked(event) == true){
                order = new Cone(order);
                order = new StrawberrySauce(order);
            }
        }
        berrySauce.setDisable(true);
        return true;
    }

    @FXML
    boolean nutSauce_Clicked(ActionEvent event) {
        if(vanilla_Clicked(event) == true){
            IceCream order = new Vanilla();
            if(cup_Clicked(event) == true){
                order = new Cup(order);
                order = new NutSauce(order);
            }
            else if (cone_Clicked(event) == true){
                order = new Cone(order);
                order = new NutSauce(order);
            }
        }
        else if(strawberry_Clicked(event) == true){
            IceCream order = new Vanilla();
            if(cup_Clicked(event) == true){
                order = new Cup(order);
                order = new NutSauce(order);
            }
            else if (cone_Clicked(event) == true){
                order = new Cone(order);
                order = new NutSauce(order);
            }
        }
        else if(chocolate_Clicked(event) == true){
            IceCream order = new Vanilla();
            if(cup_Clicked(event) == true){
                order = new Cup(order);
                order = new NutSauce(order);
            }
            else if (cone_Clicked(event) == true){
                order = new Cone(order);
                order = new NutSauce(order);
            }
        }
        nutSauce.setDisable(true);
        return true;
    }
    
    @FXML
    void checkout_Clicked(ActionEvent event) {
        if(vanilla_Clicked(event) == true){
            IceCream order = new Vanilla();
            if(cup_Clicked(event) == true){
                order = new Cup(order);
                if(nuts.isArmed()){
                    order = new Nuts(order);
                }
                if(sprinkles.isArmed()){
                    order = new Sprinkles(order);
                }
                if(chocolateChips.isArmed()){
                    order = new ChocolateChips(order);
                }
                if(chocolateSauce.isArmed()){
                    order = new ChocolateSauce(order);
                }
                if(berrySauce.isArmed()){
                    order = new StrawberrySauce(order);
                }
                if(nutSauce.isArmed()){
                    order = new NutSauce(order);
                }
                order();
                orderBill.setText(order.getDescription());
            }
            else if (cone_Clicked(event) == true){
                order = new Cone(order);
                if(nuts_Clicked(event) == true){
                    order = new Nuts(order);
                }
                if(sprinkles_Clicked(event) == true){
                    order = new Sprinkles(order);
                }
                if(chocolateChips_Clicked(event) == true){
                    order = new ChocolateChips(order);
                }
                if(chocolateSauce_Clicked(event) == true){
                    order = new ChocolateSauce(order);
                }
                if(berrySauce_Clicked(event) == true){
                    order = new StrawberrySauce(order);
                }
                if(nutSauce_Clicked(event) == true){
                    order = new NutSauce(order);
                }
                order();
                orderBill.setText(order.getDescription());
            }
        }
        else if(strawberry_Clicked(event) == true){
            IceCream order = new Vanilla();
            if(cup_Clicked(event) == true){
                order = new Cup(order);
                if(nuts_Clicked(event) == true){
                    order = new Nuts(order);
                }
                if(sprinkles_Clicked(event) == true){
                    order = new Sprinkles(order);
                }
                if(chocolateChips_Clicked(event) == true){
                    order = new ChocolateChips(order);
                }
                if(chocolateSauce_Clicked(event) == true){
                    order = new ChocolateSauce(order);
                }
                if(berrySauce_Clicked(event) == true){
                    order = new StrawberrySauce(order);
                }
                if(nutSauce_Clicked(event) == true){
                    order = new NutSauce(order);
                }
                order();
                orderBill.setText(order.getDescription());
            }
            else if (cone_Clicked(event) == true){
                order = new Cone(order);
                if(nuts_Clicked(event) == true){
                    order = new Nuts(order);
                }
                if(sprinkles_Clicked(event) == true){
                    order = new Sprinkles(order);
                }
                if(chocolateChips_Clicked(event) == true){
                    order = new ChocolateChips(order);
                }
                if(chocolateSauce_Clicked(event) == true){
                    order = new ChocolateSauce(order);
                }
                if(berrySauce_Clicked(event) == true){
                    order = new StrawberrySauce(order);
                }
                if(nutSauce_Clicked(event) == true){
                    order = new NutSauce(order);
                }
                order();
                orderBill.setText(order.getDescription());
            }
        }
        else if(chocolate_Clicked(event) == true){
            IceCream order = new Vanilla();
            if(cup_Clicked(event) == true){
                order = new Cup(order);
                if(nuts_Clicked(event) == true){
                    order = new Nuts(order);
                }
                if(sprinkles_Clicked(event) == true){
                    order = new Sprinkles(order);
                }
                if(chocolateChips_Clicked(event) == true){
                    order = new ChocolateChips(order);
                }
                if(chocolateSauce_Clicked(event) == true){
                    order = new ChocolateSauce(order);
                }
                if(berrySauce_Clicked(event) == true){
                    order = new StrawberrySauce(order);
                }
                if(nutSauce_Clicked(event) == true){
                    order = new NutSauce(order);
                }
                order();
                orderBill.setText(order.getDescription());
            }
            else if (cone_Clicked(event) == true){
                order = new Cone(order);
                if(nuts_Clicked(event) == true){
                    order = new Nuts(order);
                }
                if(sprinkles_Clicked(event) == true){
                    order = new Sprinkles(order);
                }
                if(chocolateChips_Clicked(event) == true){
                    order = new ChocolateChips(order);
                }
                if(chocolateSauce_Clicked(event) == true){
                    order = new ChocolateSauce(order);
                }
                if(berrySauce_Clicked(event) == true){
                    order = new StrawberrySauce(order);
                }
                if(nutSauce_Clicked(event) == true){
                    order = new NutSauce(order);
                }
                order();
                orderBill.setText(order.getDescription());
            }
        }
    }
    
//    void orderIceCream(){
//        
//        if(vanilla.isArmed() == true){
//            IceCream order = new Vanilla();
//            System.out.println(order.getDescription());
//            if(cup.isArmed() == true){
//                order = new Cup(order);
//                System.out.println(order.getDescription());
//                if(nuts.isArmed() == true){
//                    order = new Nuts(order);
//                    System.out.println(order.getDescription());
//                }
//                if(sprinkles.isArmed() == true){
//                    order = new Sprinkles(order);
//                    System.out.println(order.getDescription());
//                }
//                if(chocolateChips.isArmed() == true){
//                    order = new ChocolateChips(order);
//                    System.out.println(order.getDescription());
//                }
//                if(chocolateSauce.isArmed() == true){
//                    order = new ChocolateSauce(order);
//                    System.out.println(order.getDescription());
//                }
//                if(berrySauce.isArmed() == true){
//                    order = new StrawberrySauce(order);
//                    System.out.println(order.getDescription());
//                }
//                if(nutSauce.isArmed() == true){
//                    order = new NutSauce(order);
//                    System.out.println(order.getDescription());
//                }
//                if(checkout.isArmed() == true){
//                    System.out.println(order.getDescription());
//                }
//            }
//            else if(cone.isArmed() == true){
//                order = new Cone(order);
//                System.out.println(order.getDescription());
//                if(nuts.isArmed() == true){
//                    order = new Nuts(order);
//                    System.out.println(order.getDescription());
//                }
//                if(sprinkles.isArmed() == true){
//                    order = new Sprinkles(order);
//                    System.out.println(order.getDescription());
//                }
//                if(chocolateChips.isArmed() == true){
//                    order = new ChocolateChips(order);
//                    System.out.println(order.getDescription());
//                }
//                if(chocolateSauce.isArmed() == true){
//                    order = new ChocolateSauce(order);
//                    System.out.println(order.getDescription());
//                }
//                if(berrySauce.isArmed() == true){
//                    order = new StrawberrySauce(order);
//                    System.out.println(order.getDescription());
//                }
//                if(nutSauce.isArmed() == true){
//                    order = new NutSauce(order);
//                    System.out.println(order.getDescription());
//                }
//                if(checkout.isArmed() == true){
//                    System.out.println(order.getDescription());
//                }
//            }
//        }
//        else if(strawberry.isArmed() == true){
//            IceCream order = new Strawberry();
//            System.out.println(order.getDescription());
//            if(cup.isArmed() == true){
//                order = new Cup(order);
//                System.out.println(order.getDescription());
//                if(nuts.isArmed() == true){
//                    order = new Nuts(order);
//                    System.out.println(order.getDescription());
//                }
//                if(sprinkles.isArmed() == true){
//                    order = new Sprinkles(order);
//                    System.out.println(order.getDescription());
//                }
//                if(chocolateChips.isArmed() == true){
//                    order = new ChocolateChips(order);
//                    System.out.println(order.getDescription());
//                }
//                if(chocolateSauce.isArmed() == true){
//                    order = new ChocolateSauce(order);
//                    System.out.println(order.getDescription());
//                }
//                if(berrySauce.isArmed() == true){
//                    order = new StrawberrySauce(order);
//                    System.out.println(order.getDescription());
//                }
//                if(nutSauce.isArmed() == true){
//                    order = new NutSauce(order);
//                    System.out.println(order.getDescription());
//                }
//                if(checkout.isArmed() == true){
//                    System.out.println(order.getDescription());
//                }
//            }
//            else if(cone.isArmed() == true){
//                order = new Cone(order);
//                System.out.println(order.getDescription());
//                if(nuts.isArmed() == true){
//                    order = new Nuts(order);
//                    System.out.println(order.getDescription());
//                }
//                if(sprinkles.isArmed() == true){
//                    order = new Sprinkles(order);
//                    System.out.println(order.getDescription());
//                }
//                if(chocolateChips.isArmed() == true){
//                    order = new ChocolateChips(order);
//                    System.out.println(order.getDescription());
//                }
//                if(chocolateSauce.isArmed() == true){
//                    order = new ChocolateSauce(order);
//                    System.out.println(order.getDescription());
//                }
//                if(berrySauce.isArmed() == true){
//                    order = new StrawberrySauce(order);
//                    System.out.println(order.getDescription());
//                }
//                if(nutSauce.isArmed() == true){
//                    order = new NutSauce(order);
//                    System.out.println(order.getDescription());
//                }
//                if(checkout.isArmed() == true){
//                    System.out.println(order.getDescription());
//                }
//            }
//        }
//        else if(chocolate.isArmed() == true){
//            IceCream order = new Chocolate();
//            System.out.println(order.getDescription());
//            if(cup.isArmed() == true){
//                order = new Cup(order);
//                System.out.println(order.getDescription());
//                if(nuts.isArmed() == true){
//                    order = new Nuts(order);
//                    System.out.println(order.getDescription());
//                }
//                if(sprinkles.isArmed() == true){
//                    order = new Sprinkles(order);
//                    System.out.println(order.getDescription());
//                }
//                if(chocolateChips.isArmed() == true){
//                    order = new ChocolateChips(order);
//                    System.out.println(order.getDescription());
//                }
//                if(chocolateSauce.isArmed() == true){
//                    order = new ChocolateSauce(order);
//                    System.out.println(order.getDescription());
//                }
//                if(berrySauce.isArmed() == true){
//                    order = new StrawberrySauce(order);
//                    System.out.println(order.getDescription());
//                }
//                if(nutSauce.isArmed() == true){
//                    order = new NutSauce(order);
//                    System.out.println(order.getDescription());
//                }
//                if(checkout.isArmed() == true){
//                    System.out.println(order.getDescription());
//                }
//            }
//            else if(cone.isArmed() == true){
//                order = new Cone(order);
//                System.out.println(order.getDescription());
//                if(nuts.isArmed() == true){
//                    order = new Nuts(order);
//                    System.out.println(order.getDescription());
//                }
//                if(sprinkles.isArmed() == true){
//                    order = new Sprinkles(order);
//                    System.out.println(order.getDescription());
//                }
//                if(chocolateChips.isArmed() == true){
//                    order = new ChocolateChips(order);
//                    System.out.println(order.getDescription());
//                }
//                if(chocolateSauce.isArmed() == true){
//                    order = new ChocolateSauce(order);
//                    System.out.println(order.getDescription());
//                }
//                if(berrySauce.isArmed() == true){
//                    order = new StrawberrySauce(order);
//                    System.out.println(order.getDescription());
//                }
//                if(nutSauce.isArmed() == true){
//                    order = new NutSauce(order);
//                    System.out.println(order.getDescription());
//                }
//                if(checkout.isArmed() == true){
//                    System.out.println(order.getDescription());
//                }
//            }
//        }
//    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    
}

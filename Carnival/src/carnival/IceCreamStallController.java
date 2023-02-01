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
import carnival.Scoreboard;
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
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class IceCreamStallController implements Initializable {
    @FXML private Label score;
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
    boolean yes_Clicked(ActionEvent event) {
        clear();
        vanilla.setVisible(false);
        cone.setVisible(false);
        strawberry.setVisible(false);
        chocolate.setVisible(false);
        chocolateSauce.setVisible(false);
        nutSauce.setVisible(false);
        berrySauce.setVisible(false);
        nuts.setVisible(false);
        sprinkles.setVisible(false);
        chocolateChips.setVisible(false);
        cup.setVisible(false);
        orderBill.setVisible(false);
        orderBill.clear();
        orderLabel.setVisible(false);
        orderPane.setVisible(false);
        flavourLabel.setVisible(true);
        flavourPane.setVisible(true);
        menuPane.setVisible(true);
        return true;
    }

    @FXML
    void no_Clicked(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }
    
    void container(){
        flavourLabel.setVisible(false);
        flavourPane.setVisible(false);
        containerLabel.setVisible(true);
        containerPane.setVisible(true);
        invalidFlavour.setVisible(false);
    }
    
    void sauce(){
        containerLabel.setVisible(false);
        containerPane.setVisible(false);
        sauceLabel.setVisible(true);
        saucePane.setVisible(true);
        invalidContainer.setVisible(false);
    }
    
    void topping(){
        sauceLabel.setVisible(false);
        saucePane.setVisible(false);
        toppingLabel.setVisible(true);
        toppingPane.setVisible(true);
    }
    
    void order(){
        menuPane.setVisible(false);
        toppingLabel.setVisible(false);
        toppingPane.setVisible(false);
        orderLabel.setVisible(true);
        orderPane.setVisible(true);
        orderBill.setVisible(true);
    }
    
    void clear(){
        flavourBox.clear();
        containerBox.clear();
        sauceBox.clear();
        nutsBox.setSelected(false);
        sprinklesBox.setSelected(false);
        chocolateChipsBox.setSelected(false);
        invalidSauce.setVisible(false);
        invalidFlavour.setVisible(false);
        invalidContainer.setVisible(false);
    }
    
    
    @FXML
    void nextFlavour_Clicked(ActionEvent event) throws IOException {
        if(flavourBox.getText().equalsIgnoreCase("vanilla")){
            container();
        }
        else if(flavourBox.getText().equalsIgnoreCase("strawberry")){
            container();
        }
        else if(flavourBox.getText().equalsIgnoreCase("chocolate")){
            container();
        }
        else{
            invalidFlavour.setVisible(true);
        }
    }
    
    @FXML
    void nextContainer_Clicked(ActionEvent event) throws IOException {
        if(flavourBox.getText().equalsIgnoreCase("vanilla")){
            vanilla.setVisible(true);
            if(containerBox.getText().equalsIgnoreCase("cup")){
                cup.setVisible(true);
                sauce();
            }
            else if(containerBox.getText().equalsIgnoreCase("cone")){
                cone.setVisible(true);
                sauce();
            }
            else{
                invalidContainer.setVisible(true);
            }
        }
        else if(flavourBox.getText().equalsIgnoreCase("strawberry")){
            strawberry.setVisible(true);
            if(containerBox.getText().equalsIgnoreCase("cup")){
                cup.setVisible(true);
                sauce();
            }
            else if(containerBox.getText().equalsIgnoreCase("cone")){
                cone.setVisible(true);
                sauce();
            }
            else{
                invalidContainer.setVisible(true);
            }
        }
        else if(flavourBox.getText().equalsIgnoreCase("chocolate")){
            chocolate.setVisible(true);
            if(containerBox.getText().equalsIgnoreCase("cup")){
                cup.setVisible(true);
                sauce();
            }
            else if(containerBox.getText().equalsIgnoreCase("cone")){
                cone.setVisible(true);
                sauce();
            }
            else{
                invalidContainer.setVisible(true);
            }
        }
    }
    
    @FXML
    void nextSauce_Clicked(ActionEvent event) throws IOException {
        if(sauceBox.getText().equalsIgnoreCase("chocolate")){
            chocolateSauce.setVisible(true);
            topping();
        }
        else if(sauceBox.getText().equalsIgnoreCase("berry")){
            berrySauce.setVisible(true);
            topping();
        }
        else if(sauceBox.getText().equalsIgnoreCase("nut")){
            nutSauce.setVisible(true);
            topping();
        }else {
            invalidSauce.setVisible(true);
        }
    }
    
    @FXML
    void checkout_Clicked(ActionEvent event) throws IOException {
        if(nutsBox.isSelected()){
            nuts.setVisible(true);
        }
        if(sprinklesBox.isSelected()){
            sprinkles.setVisible(true);
        }
        if(chocolateChipsBox.isSelected()){
            chocolateChips.setVisible(true);
        }
        orderIceCream();
        order();
        Scoreboard scoreboard=Scoreboard.getInstance();
        String bill=orderBill.getText();
        String[] billArray=bill.split(" ");
        int sc=Integer.parseInt(billArray[0]);
        scoreboard.deductScore(sc);
        score.setText("Points: "+ scoreboard.getScore());


    }
    
    void orderIceCream(){
        do{
            String flavour = flavourBox.getText();
            if(flavour.equalsIgnoreCase("vanilla")){
                IceCream order = new Vanilla();
                do{
                    String container = containerBox.getText();  
                    if(container.equalsIgnoreCase("cup")){
                        order = new Cup(order);
                        do{
                            String sauce = sauceBox.getText();
                            sauceBox.clear();
                            if(sauce.equalsIgnoreCase("chocolate")){
                                order = new ChocolateSauce(order);
                                if(nutsBox.isSelected()){
                                    order = new Nuts(order);
                                }
                                if(sprinklesBox.isSelected()){
                                    order = new Sprinkles(order);
                                }
                                if(chocolateChipsBox.isSelected()){
                                    order = new ChocolateChips(order);
                                }
                                System.out.println(order.getDescription());
                                orderBill.setText(Integer.toString(order.cost()) + " Points");
                                clear();
                            }
                            else if(sauce.equalsIgnoreCase("berry")){
                                order = new StrawberrySauce(order);
                                if(nutsBox.isSelected()){
                                    order = new Nuts(order);
                                }
                                if(sprinklesBox.isSelected()){
                                    order = new Sprinkles(order);
                                }
                                if(chocolateChipsBox.isSelected()){
                                    order = new ChocolateChips(order);
                                }
                                System.out.println(order.getDescription());
                                orderBill.setText(Integer.toString(order.cost()) + " Points");
                                clear();
                            }
                            else if(sauce.equalsIgnoreCase("nut")){
                                order = new NutSauce(order);
                                if(nutsBox.isSelected()){
                                    order = new Nuts(order);
                                }
                                if(sprinklesBox.isSelected()){
                                    order = new Sprinkles(order);
                                }
                                if(chocolateChipsBox.isSelected()){
                                    order = new ChocolateChips(order);
                                }
                                System.out.println(order.getDescription());
                                orderBill.setText(Integer.toString(order.cost()) + " Points");
                                clear();
                            }
                        }while(!sauceBox.getText().isEmpty());
                    }
                    else if(container.equalsIgnoreCase("cone")){
                        order = new Cone(order);
                        do{
                            String sauce = sauceBox.getText();
                            sauceBox.clear();
                            if(sauce.equalsIgnoreCase("chocolate")){
                                order = new ChocolateSauce(order);
                                if(nutsBox.isSelected()){
                                    order = new Nuts(order);
                                }
                                if(sprinklesBox.isSelected()){
                                    order = new Sprinkles(order);
                                }
                                if(chocolateChipsBox.isSelected()){
                                    order = new ChocolateChips(order);
                                }
                                System.out.println(order.getDescription());
                                orderBill.setText(Integer.toString(order.cost()) + " Points");
                                clear();
                            }
                            else if(sauce.equalsIgnoreCase("berry")){
                                order = new StrawberrySauce(order);
                                if(nutsBox.isSelected()){
                                    order = new Nuts(order);
                                }
                                if(sprinklesBox.isSelected()){
                                    order = new Sprinkles(order);
                                }
                                if(chocolateChipsBox.isSelected()){
                                    order = new ChocolateChips(order);
                                }
                                System.out.println(order.getDescription());
                                orderBill.setText(Integer.toString(order.cost()) + " Points");
                                clear();
                            }
                            else if(sauce.equalsIgnoreCase("nut")){
                                order = new NutSauce(order);
                                if(nutsBox.isSelected()){
                                    order = new Nuts(order);
                                }
                                if(sprinklesBox.isSelected()){
                                    order = new Sprinkles(order);
                                }
                                if(chocolateChipsBox.isSelected()){
                                    order = new ChocolateChips(order);
                                }
                                System.out.println(order.getDescription());
                                orderBill.setText(Integer.toString(order.cost()) + " Points");
                                clear();
                            }
                        }while(!sauceBox.getText().isEmpty());
                    }
                }while(!containerBox.getText().isEmpty());
            }
            else if(flavour.equalsIgnoreCase("strawberry")){
                IceCream order = new Strawberry();
                do{
                    String container = containerBox.getText();
                    if(container.equalsIgnoreCase("cup")){
                        order = new Cup(order);
                        do{
                            String sauce = sauceBox.getText();
                            sauceBox.clear();
                            if(sauce.equalsIgnoreCase("chocolate")){
                                order = new ChocolateSauce(order);
                                if(nutsBox.isSelected()){
                                    order = new Nuts(order);
                                }
                                if(sprinklesBox.isSelected()){
                                    order = new Sprinkles(order);
                                }
                                if(chocolateChipsBox.isSelected()){
                                    order = new ChocolateChips(order);
                                }
                                System.out.println(order.getDescription());
                                orderBill.setText(Integer.toString(order.cost()) + " Points");
                                clear();
                            }
                            else if(sauce.equalsIgnoreCase("berry")){
                                order = new StrawberrySauce(order);
                                if(nutsBox.isSelected()){
                                    order = new Nuts(order);
                                }
                                if(sprinklesBox.isSelected()){
                                    order = new Sprinkles(order);
                                }
                                if(chocolateChipsBox.isSelected()){
                                    order = new ChocolateChips(order);
                                }
                                System.out.println(order.getDescription());
                                orderBill.setText(Integer.toString(order.cost()) + " Points");
                                clear();
                            }
                            else if(sauce.equalsIgnoreCase("nut")){
                                order = new NutSauce(order);
                                if(nutsBox.isSelected()){
                                    order = new Nuts(order);
                                }
                                if(sprinklesBox.isSelected()){
                                    order = new Sprinkles(order);
                                }
                                if(chocolateChipsBox.isSelected()){
                                    order = new ChocolateChips(order);
                                }
                                System.out.println(order.getDescription());
                                orderBill.setText(Integer.toString(order.cost()) + " Points");
                                clear();
                            }
                        }while(!sauceBox.getText().isEmpty());
                    }
                    else if(container.equalsIgnoreCase("cone")){
                        order = new Cone(order);
                        do{
                            String sauce = sauceBox.getText();
                            sauceBox.clear();
                            if(sauce.equalsIgnoreCase("chocolate")){
                                order = new ChocolateSauce(order);
                                if(nutsBox.isSelected()){
                                    order = new Nuts(order);
                                }
                                if(sprinklesBox.isSelected()){
                                    order = new Sprinkles(order);
                                }
                                if(chocolateChipsBox.isSelected()){
                                    order = new ChocolateChips(order);
                                }
                                System.out.println(order.getDescription());
                                orderBill.setText(Integer.toString(order.cost()) + " Points");
                                clear();
                            }
                            else if(sauce.equalsIgnoreCase("berry")){
                                order = new StrawberrySauce(order);
                                if(nutsBox.isSelected()){
                                    order = new Nuts(order);
                                }
                                if(sprinklesBox.isSelected()){
                                    order = new Sprinkles(order);
                                }
                                if(chocolateChipsBox.isSelected()){
                                    order = new ChocolateChips(order);
                                }
                                System.out.println(order.getDescription());
                                orderBill.setText(Integer.toString(order.cost()) + " Points");
                                clear();
                            }
                            else if(sauce.equalsIgnoreCase("nut")){
                                order = new NutSauce(order);
                                if(nutsBox.isSelected()){
                                    order = new Nuts(order);
                                }
                                if(sprinklesBox.isSelected()){
                                    order = new Sprinkles(order);
                                }
                                if(chocolateChipsBox.isSelected()){
                                    order = new ChocolateChips(order);
                                }
                                System.out.println(order.getDescription());
                                orderBill.setText(Integer.toString(order.cost()) + " Points");
                                clear();
                            }
                        }while(!sauceBox.getText().isEmpty());
                    }
                }while(!containerBox.getText().isEmpty());
            }
            else if(flavour.equalsIgnoreCase("chocolate")){
                IceCream order = new Chocolate();
                do{
                    String container = containerBox.getText();
                    if(container.equalsIgnoreCase("cup")){
                        order = new Cup(order);
                        do{
                            String sauce = sauceBox.getText();
                            sauceBox.clear();
                            if(sauce.equalsIgnoreCase("chocolate")){
                                order = new ChocolateSauce(order);
                                if(nutsBox.isSelected()){
                                    order = new Nuts(order);
                                }
                                if(sprinklesBox.isSelected()){
                                    order = new Sprinkles(order);
                                }
                                if(chocolateChipsBox.isSelected()){
                                    order = new ChocolateChips(order);
                                }
                                System.out.println(order.getDescription());
                                orderBill.setText(Integer.toString(order.cost()) + " Points");
                                clear();
                            }
                            else if(sauce.equalsIgnoreCase("berry")){
                                order = new StrawberrySauce(order);
                                if(nutsBox.isSelected()){
                                    order = new Nuts(order);
                                }
                                if(sprinklesBox.isSelected()){
                                    order = new Sprinkles(order);
                                }
                                if(chocolateChipsBox.isSelected()){
                                    order = new ChocolateChips(order);
                                }
                                System.out.println(order.getDescription());
                                orderBill.setText(Integer.toString(order.cost()) + " Points");
                                clear();
                            }
                            else if(sauce.equalsIgnoreCase("nut")){
                                order = new NutSauce(order);
                                if(nutsBox.isSelected()){
                                    order = new Nuts(order);
                                }
                                if(sprinklesBox.isSelected()){
                                    order = new Sprinkles(order);
                                }
                                if(chocolateChipsBox.isSelected()){
                                    order = new ChocolateChips(order);
                                }
                                System.out.println(order.getDescription());
                                orderBill.setText(Integer.toString(order.cost()) + " Points");
                                clear();
                            }
                        }while(!sauceBox.getText().isEmpty());
                    }
                    else if(container.equalsIgnoreCase("cone")){
                        order = new Cone(order);
                        do{
                            String sauce = sauceBox.getText();
                            sauceBox.clear();
                            if(sauce.equalsIgnoreCase("chocolate")){
                                order = new ChocolateSauce(order);
                                if(nutsBox.isSelected()){
                                    order = new Nuts(order);
                                }
                                if(sprinklesBox.isSelected()){
                                    order = new Sprinkles(order);
                                }
                                if(chocolateChipsBox.isSelected()){
                                    order = new ChocolateChips(order);
                                }
                                System.out.println(order.getDescription());
                                orderBill.setText(Integer.toString(order.cost()) + " Points");
                                clear();
                            }
                            else if(sauce.equalsIgnoreCase("berry")){
                                order = new StrawberrySauce(order);
                                if(nutsBox.isSelected()){
                                    order = new Nuts(order);
                                }
                                if(sprinklesBox.isSelected()){
                                    order = new Sprinkles(order);
                                }
                                if(chocolateChipsBox.isSelected()){
                                    order = new ChocolateChips(order);
                                }
                                System.out.println(order.getDescription());
                                orderBill.setText(Integer.toString(order.cost()) + " Points");
                                clear();
                            }
                            else if(sauce.equalsIgnoreCase("nut")){
                                order = new NutSauce(order);
                                if(nutsBox.isSelected()){
                                    order = new Nuts(order);
                                }
                                if(sprinklesBox.isSelected()){
                                    order = new Sprinkles(order);
                                }
                                if(chocolateChipsBox.isSelected()){
                                    order = new ChocolateChips(order);
                                }
                                System.out.println(order.getDescription());
                                orderBill.setText(Integer.toString(order.cost()) + " Points");
                                clear();
                            }
                        }while(!sauceBox.getText().isEmpty());
                    }
                }while(!containerBox.getText().isEmpty());
            }
        }while(!flavourBox.getText().isEmpty());
        clear();
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        Scoreboard scoreboard=Scoreboard.getInstance();
        score.setText("POINTS: " + String.valueOf(scoreboard.getScore()));
    }
    
}

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
    

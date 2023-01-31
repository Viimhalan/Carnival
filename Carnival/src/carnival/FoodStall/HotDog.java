/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carnival.FoodStall;

/**
 *
 * @author user
 */
public class HotDog extends Food {
    FoodIngredientFactory factory;
    
    public HotDog(FoodIngredientFactory factory) {
        this.factory = factory;
    }
    
    void prepare() {
        System.out.println("Preparing " + name);
        sauce = factory.createSauce();
        bread = factory.createBread();
        cheese = factory.createCheese();
        veggie = factory.createVeggie();
        meat = factory.createMeat();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carnival.FoodStall;

/**
 *
 * @author user
 */
public class HotDogIngredientFactory implements FoodIngredientFactory{
    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }

    @Override
    public Bread createBread() {
        return new MultiGrainBread();
    }

    @Override
    public Cheese createCheese() {
        return new Cheddar();
    }

    @Override
    public Veggie createVeggie() {
        return new Cucumber();
    }

    @Override
    public Meat createMeat() {
        return new Sausage();
    }
}

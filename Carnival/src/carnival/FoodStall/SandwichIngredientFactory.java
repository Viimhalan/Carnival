/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carnival.FoodStall;

/**
 *
 * @author user
 */
public class SandwichIngredientFactory implements FoodIngredientFactory{
    @Override
    public Sauce createSauce() {
        return new ChilliSauce();
    }

    @Override
    public Bread createBread() {
        return new WhiteBread();
    }

    @Override
    public Cheese createCheese() {
        return new Mozarella();
    }

    @Override
    public Veggie createVeggie() {
        return new Tomato();
    }

    @Override
    public Meat createMeat() {
        return new ChickenSlice();
    }
}

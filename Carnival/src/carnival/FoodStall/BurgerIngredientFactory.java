/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carnival.FoodStall;

/**
 *
 * @author user
 */
public class BurgerIngredientFactory implements FoodIngredientFactory{

    @Override
    public Sauce createSauce() {
        return new BBQSauce();
    }

    @Override
    public Bread createBread() {
        return new WholeWheatBread();
    }

    @Override
    public Cheese createCheese() {
        return new Parmesan();
    }

    @Override
    public Veggie createVeggie() {
        return new Celery();
    }

    @Override
    public Meat createMeat() {
        return new Patty();
    }
    
}

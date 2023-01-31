/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carnival.FoodStall;

/**
 *
 * @author user
 */
public class FoodStall {
    protected Food createFood(String item) {
        Food food = null;
        FoodIngredientFactory factory = new BurgerIngredientFactory();
        FoodIngredientFactory factory1 = new SandwichIngredientFactory();
        FoodIngredientFactory factory2 = new HotDogIngredientFactory();
        
        if (item.equals("burger")) {
            food = new Burger(factory);
            food.setName("Burger");
        }
        
        if (item.equals("sandwich")) {
            food = new Sandwich(factory1);
            food.setName("Sandwich");
        }
        
        if (item.equals("hotdog")) {
            food = new HotDog(factory2);
            food.setName("HotDog");
        }
        return food;
    }
    
    public Food orderFood(String type) {
        Food food = createFood(type);
        System.out.println("--- Making a " + food.getName() + " ---");
        food.prepare();
        food.wrap();
        return food;
    }
}

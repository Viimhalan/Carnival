/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carnival.FoodStall;

/**
 *
 * @author user
 */
public abstract class Food {
    String name;
    
    Sauce sauce;
    Bread bread;
    Cheese cheese;
    Veggie veggie;
    Meat meat;
    
    abstract void prepare();
    
    
    void wrap() {
        System.out.println("Wrapping the food");
    }
    
    void setName(String name) {
        this.name = name;
    }
    
    String getName() {
        return name;
    }
    
    public String toString() {
        StringBuffer result = new StringBuffer();
		result.append("---- " + name + " ----\n");
		if (sauce != null) {
			result.append(sauce);
			result.append("\n");
		}
		if (bread != null) {
			result.append(bread);
			result.append("\n");
		}
		if (cheese != null) {
			result.append(cheese);
			result.append("\n");
		}
		if (veggie != null) {
			result.append(veggie);
			result.append("\n");
		}
		if (meat != null) {
			result.append(meat);
			result.append("\n");
		}
		return result.toString();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carnival.FoodStall;

import java.util.Scanner;

/**
 *
 * @author user Vinishaah (17205417/1) TG1
 */
public class AbstractFoodStallFactoryTestDrive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FoodStall burger = new FoodStall();
        FoodStall sandwich = new FoodStall();
        FoodStall hotdog = new FoodStall();
        
        Food food = burger.orderFood("burger");
        System.out.println("Ethan ordered a " + food );
        
        Food food1 = sandwich.orderFood("sandwich");
        System.out.println("Ethan ordered a " + food1 );
        
        Food food2 = hotdog.orderFood("hotdog");
        System.out.println("Ethan ordered a " + food2 );
        
    }
    
}

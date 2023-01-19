/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carnival.fortuneWeighingScale;

import java.util.Random;

/**
 *
 * @author user
 */
public class HasPennyState implements State{
    Random randomWinner = new Random(System.currentTimeMillis());
    Random randomAge = new Random();
    FortuneWeighingScale fortuneWeighingScale;
    
    public HasPennyState(FortuneWeighingScale fortuneWeighingScale){
        this.fortuneWeighingScale = fortuneWeighingScale;
    }
    
    public void insertPenny(){
        System.out.println("You can't insert another penny");
    }
    
    public void ejectPenny(){
        System.out.println("Penny returned");
        fortuneWeighingScale.setState(fortuneWeighingScale.getNoPennyState());
    }
    
    public void pressButton(){
        System.out.println("You pressed to check your weight...calculating your weight");
        int age = randomAge.nextInt(100-50)+50;
        System.out.println("Your weight is " + age);
        fortuneWeighingScale.setState(fortuneWeighingScale.getDisplayWeightState());
    }
    
    public void turnCrank(){
        System.out.println("You turned...");
        int winner = randomWinner.nextInt(10);
        if((winner == 0) && (fortuneWeighingScale.getCount() > 1)){
            fortuneWeighingScale.setState(fortuneWeighingScale.getLuckyState());
        }
        else{
            fortuneWeighingScale.setState(fortuneWeighingScale.getMessageDroppedState());
        }
    }
    
    public void dispenseMsg(){
        System.out.println("No fortune message dispensed");
    }
    
    public String toString() {
        return "has penny";
    }
}

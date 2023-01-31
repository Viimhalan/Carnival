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
    public int age = randomAge.nextInt(100-50)+50;
    FortuneWeighingScale fortuneWeighingScale;
    
    public HasPennyState(FortuneWeighingScale fortuneWeighingScale){
        this.fortuneWeighingScale = fortuneWeighingScale;
    }
    
    public String insertPenny(){
        String hasPenny = "You can't insert another penny";
        System.out.println(hasPenny);
        return hasPenny;
    }
    
    public String ejectPenny(){
        String hasEject = "Penny returned";
        System.out.println(hasEject);
        fortuneWeighingScale.setState(fortuneWeighingScale.getNoPennyState());
        return hasEject;
    }
    
    public String pressButton(){
        String hasPressBtn = "You pressed to check your weight..." + "\nYour weight is being displayed now!";
        System.out.println(hasPressBtn);
//        int age = randomAge.nextInt(100-50)+50;
        fortuneWeighingScale.setState(fortuneWeighingScale.getDisplayWeightState());
        return hasPressBtn;
    }
    
    public String turnCrank(){
        String hasCrank = "You turned...";
        System.out.println(hasCrank);
        int winner = randomWinner.nextInt(10);
        if((winner == 0) && (fortuneWeighingScale.getCount() > 1)){
            fortuneWeighingScale.setState(fortuneWeighingScale.getLuckyState());
        }
        else{
            fortuneWeighingScale.setState(fortuneWeighingScale.getMessageDroppedState());
        }
        return hasCrank;
    }
    
    public String dispenseMsg(){
        String hasDispense = "Fortune message will be dispensed after weight displayed";
        System.out.println(hasDispense);
        return hasDispense;
    }
    
    public String toString() {
        return "has penny";
    }
}

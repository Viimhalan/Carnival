/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carnival.fortuneWeighingScale;

/**
 *
 * @author user
 */
public class DisplayWeightState implements State{
    FortuneWeighingScale fortuneWeighingScale;
    
    public DisplayWeightState(FortuneWeighingScale fortuneWeighingScale){
        this.fortuneWeighingScale = fortuneWeighingScale;
    }
    
    public void insertPenny(){
        System.out.println("You have already inserted a penny");
    }
    
    public void ejectPenny(){
        System.out.println("Too late to eject the penny. ");
    }
    
    public void pressButton(){
        System.out.println("Weight is being displayed");
    }
    
    public void turnCrank(){
        System.out.println("You turned");
        fortuneWeighingScale.setState(fortuneWeighingScale.getMessageDroppedState());
    }
    
    public void dispenseMsg(){
        System.out.println("Getting you the fortune message");
    }
    
    public String toString() {
        return "is displaying weight";
    }
}

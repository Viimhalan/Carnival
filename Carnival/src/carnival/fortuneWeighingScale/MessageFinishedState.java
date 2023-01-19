/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carnival.fortuneWeighingScale;

/**
 *
 * @author user
 */
public class MessageFinishedState implements State{
    FortuneWeighingScale fortuneWeighingScale;
    
    public MessageFinishedState(FortuneWeighingScale fortuneWeighingScale){
        this.fortuneWeighingScale = fortuneWeighingScale;
    }
    
    public void insertPenny(){
        System.out.println("You can't insert a penny, the machine is sold out");
    }
    
    public void ejectPenny(){
        System.out.println("You can't eject, you haven't inserted a penny yet");
    }
    
    public void pressButton(){
        System.out.println("No weight displayed");
    }
    
    public void turnCrank(){
        System.out.println("You turned, but there are no fortune messages left");
    }
    
    public void refill(){
        fortuneWeighingScale.setState(fortuneWeighingScale.getNoPennyState());
    }
    
    public String toString(){
        return "sold out";
    }
    
    public void dispenseMsg(){
        System.out.println("No fortune message dispensed.");
    }
}

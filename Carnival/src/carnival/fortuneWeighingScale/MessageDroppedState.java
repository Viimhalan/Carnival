/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carnival.fortuneWeighingScale;

/**
 *
 * @author user
 */
public class MessageDroppedState implements State{
    FortuneWeighingScale fortuneWeighingScale;
    
    public MessageDroppedState(FortuneWeighingScale fortuneWeighingScale){
        this.fortuneWeighingScale = fortuneWeighingScale;
    }
    
    public void insertPenny(){
        System.out.println("Please wait, we're already giving you a fortune message");
    }
    
    public void ejectPenny(){
        System.out.println("Sorry, you already turned the crank");
    }
    
    public void turnCrank(){
        System.out.println("Turning twice doesn't get you another fortune message!");
    }
    
    public void pressButton(){
        System.out.println("Your weight is already displayed");
    }
    
    public void dispenseMsg(){
        fortuneWeighingScale.releaseMsg();
        if(fortuneWeighingScale.getCount() > 0){
            fortuneWeighingScale.setState(fortuneWeighingScale.getNoPennyState());
        }
        else{
            System.out.println("Oops, out of fortune messages!");
            fortuneWeighingScale.setState(fortuneWeighingScale.getMessageFinishedState());
        }
    }
    
    public String toString() {
        return "is sold";
    }
}

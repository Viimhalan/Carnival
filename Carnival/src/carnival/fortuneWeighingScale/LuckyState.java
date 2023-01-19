/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carnival.fortuneWeighingScale;

/**
 *
 * @author user
 */
public class LuckyState implements State{
    FortuneWeighingScale fortuneWeighingScale;
    
    public LuckyState(FortuneWeighingScale fortuneWeighingScale){
        this.fortuneWeighingScale = fortuneWeighingScale;
    }
    
    public void insertPenny(){
        System.out.println("Please wait, we're already giving you a fortune message");
    }
    
    public void ejectPenny(){
        System.out.println("Sorry, you already turned the crank");
    }
    
    public void pressButton(){
        System.out.println("Weight already displayed");
    }
    
    public void turnCrank(){
        System.out.println("Turning twice doesn't get you another fortune message!");
    }
    
    public void dispenseMsg(){
        fortuneWeighingScale.releaseMsg();
        if(fortuneWeighingScale.getCount() == 0){
            fortuneWeighingScale.setState(fortuneWeighingScale.getMessageFinishedState());
        }
        else{
            fortuneWeighingScale.releaseMsg();
            System.out.println("YOU'RE SO LUCKY! You got two fortune messages for your penny! Enjoy your day!");
            if(fortuneWeighingScale.getCount() > 0){
                fortuneWeighingScale.setState(fortuneWeighingScale.getNoPennyState());
            }
            else{
                System.out.println("Oops, out of fortune messages!");
                fortuneWeighingScale.setState(fortuneWeighingScale.getMessageFinishedState());
            }
        }
    }
}

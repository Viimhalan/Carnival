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
    
    public String insertPenny(){
        String drpInsert = "Please wait, we're already giving you a fortune message";
        System.out.println(drpInsert);
        return drpInsert;
    }
    
    public String ejectPenny(){
        String drpEject = "Sorry, you already turned the crank";
        System.out.println(drpEject);
        return drpEject;
    }
    
    public String pressButton(){
        String drpPressBtn = "Your weight is already displayed";
        System.out.println(drpPressBtn);
        return drpPressBtn;
    }
    
    public String turnCrank(){
        String drpCrank = "Turning twice doesn't get you another fortune message!";
        System.out.println(drpCrank);
        return drpCrank;
    }
    
    public String dispenseMsg(){
        String msg = fortuneWeighingScale.releaseMsg();
        System.out.println(msg);
        if(fortuneWeighingScale.getCount() > 0){
            fortuneWeighingScale.setState(fortuneWeighingScale.getNoPennyState());
        }
        else{
            msg = "Oops, out of fortune messages!";
            System.out.println(msg);
            fortuneWeighingScale.setState(fortuneWeighingScale.getMessageFinishedState());
        }
        return msg;
    }
    
    public String toString() {
        return "is sold";
    }
}

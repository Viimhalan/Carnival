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
    
    public String insertPenny(){
        String lckInsert = "Please wait, we're already giving you a fortune message";
        System.out.println(lckInsert);
        return lckInsert;
    }
    
    public String ejectPenny(){
        String lckEject = "Sorry, you already turned the crank";
        System.out.println(lckEject);
        return lckEject;
    }
    
    public String pressButton(){
        String lckPressBtn = "Weight already displayed";
        System.out.println(lckPressBtn);
        return lckPressBtn;
    }
    
    public String turnCrank(){
        String lckCrank = "Turning twice doesn't get you another fortune message!";
        System.out.println(lckCrank);
        return lckCrank;
    }
    
    public String dispenseMsg(){
        String msg = fortuneWeighingScale.releaseMsg();
        System.out.println(msg);
        if(fortuneWeighingScale.getCount() == 0){
            fortuneWeighingScale.setState(fortuneWeighingScale.getMessageFinishedState());
        }
        else{
            msg = fortuneWeighingScale.releaseMsg() + "\nYOU'RE SO LUCKY! You got two fortune messages for your penny! Enjoy your day!";
            System.out.println(msg);
            if(fortuneWeighingScale.getCount() > 0){
                fortuneWeighingScale.setState(fortuneWeighingScale.getNoPennyState());
            }
            else{
                msg = "Oops, out of fortune messages!";
                System.out.println(msg);
                fortuneWeighingScale.setState(fortuneWeighingScale.getMessageFinishedState());
            }
        }
        return msg;
    }
}

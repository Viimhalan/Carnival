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
    
    public String insertPenny(){
        String finInsert = "You can't insert a penny, the machine is sold out";
        System.out.println(finInsert);
        return finInsert;
    }
    
    public String ejectPenny(){
        String finEject = "You can't eject, you haven't inserted a penny yet";
        System.out.println(finEject);
        return finEject;
    }
    
    public String pressButton(){
        String finPressBtn = "No weight displayed";
        System.out.println(finPressBtn);
        return finPressBtn;
    }
    
    public String turnCrank(){
        String finCrank = "You turned, but there are no fortune messages left";
        System.out.println(finCrank);
        return finCrank;
    }
    
    public void refill(){
        fortuneWeighingScale.setState(fortuneWeighingScale.getNoPennyState());
    }
    
    public String toString(){
        return "sold out";
    }
    
    public String dispenseMsg(){
        String finDispense = "So, no fortune message dispensed.";
        System.out.println(finDispense);
        return finDispense;
    }
}

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
    
    public String insertPenny(){
        String disInsert = "You have already inserted a penny";
        System.out.println(disInsert);
        return disInsert;
    }
    
    public String ejectPenny(){
        String disEject = "Too late to eject the penny. ";
        System.out.println(disEject);
        return disEject;
    }
    
    public String pressButton(){
        String disPressBtn = "Weight is being displayed";
        System.out.println(disPressBtn);
        return disPressBtn;
    }
    
    public String turnCrank(){
        String disCrank = "You turned";
        System.out.println(disCrank);
        fortuneWeighingScale.setState(fortuneWeighingScale.getMessageDroppedState());
        return disCrank;
    }
    
    public String dispenseMsg(){
        String disDispense = "Getting you the fortune message";
        System.out.println(disDispense);
        return disDispense;
    }
    
    public String toString() {
        return "is displaying weight";
    }
}

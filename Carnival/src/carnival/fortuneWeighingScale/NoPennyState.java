/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carnival.fortuneWeighingScale;

/**
 *
 * @author user
 */
public class NoPennyState implements State{
    FortuneWeighingScale fortuneWeighingScale;
    
    public NoPennyState(FortuneWeighingScale fortuneWeighingScale){
        this.fortuneWeighingScale = fortuneWeighingScale;
    }
    
    public String insertPenny(){
        String noInsert = "You inserted a penny";
        System.out.println(noInsert);
        fortuneWeighingScale.setState(fortuneWeighingScale.getHasPennyState());
        return noInsert;
    }
    
    public String ejectPenny(){
        String noEject = "You haven't inserted a penny";
        System.out.println(noEject);
        return noEject;
    }
    
    public String pressButton(){
        String noPressBtn = "Insert a penny to display weight";
        System.out.println(noPressBtn);
        return noPressBtn;
    }
    
    public String turnCrank(){
        String noCrank = "You turned, but there's no penny";
        System.out.println(noCrank);
        return noCrank;
    }
    
    public String dispenseMsg(){
        String noDispense = "You need to pay first";
        System.out.println(noDispense);
        return noDispense;
    }
    
    public String toString() {
        return "is waiting for penny";
    }
}

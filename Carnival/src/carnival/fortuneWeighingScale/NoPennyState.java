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
    
    public void insertPenny(){
        System.out.println("You inserted a penny");
        fortuneWeighingScale.setState(fortuneWeighingScale.getHasPennyState());
    }
    
    public void ejectPenny(){
        System.out.println("You haven't inserted a penny");
    }
    
    public void pressButton(){
        System.out.println("No Weight displayed");
    }
    
    public void turnCrank(){
        System.out.println("You turned, but there's no penny");
    }
    
    public void dispenseMsg(){
        System.out.println("You need to pay first");
    }
    
    public String toString() {
        return "is waiting for penny";
    }
}

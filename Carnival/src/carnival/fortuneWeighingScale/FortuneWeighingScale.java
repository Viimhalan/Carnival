/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carnival.fortuneWeighingScale;

/**
 *
 * @author user
 */
public class FortuneWeighingScale {
    State displayWeightState;
    State noPennyState;
    State hasPennyState;
    State messageDroppedState;
    State messageFinishedState;
    State luckyState;
    
    State state;
    int count = 0;
    
    public FortuneWeighingScale(int numberMessages){
        displayWeightState = new DisplayWeightState(this);
        noPennyState = new NoPennyState(this);
        hasPennyState = new HasPennyState(this);
        messageDroppedState = new MessageDroppedState(this);
        messageFinishedState = new MessageFinishedState(this);
        luckyState = new LuckyState(this);
        
        this.count = numberMessages;
        if(numberMessages > 0){
            state = noPennyState;
        }
        else{
            state = messageFinishedState;
        }
    }
    
    public void insertPenny(){
        state.insertPenny();
    }
    
    public void ejectPenny(){
        state.ejectPenny();
    }
    
    public void pressButton(){
        state.pressButton();
    }
    
    public void turnCrank(){
        state.turnCrank();
        state.dispenseMsg();
    }
    
    public void setState(State state){
        this.state = state;
    }
    
    public State getState(){
        return state;
    }
    
    void releaseMsg(){
        System.out.println("A fortune message drops out from the weighing scale machine...");
        if(count != 0){
            count = count - 1;
        }
    }
    
    public void refill(int count){
        this.count += count;
        System.out.println("The fortune weighing scale was just refilled with fortune messages; its new count is: " + this.count);
    }
    
    public State getHasPennyState(){
        return hasPennyState;
    }
    
    public State getNoPennyState(){
        return noPennyState;
    }
    
    public State getDisplayWeightState(){
        return displayWeightState;
    }
    
    public State getMessageDroppedState(){
        return messageDroppedState;
    }
    
    public State getMessageFinishedState(){
        return messageFinishedState;
    }
    
    public State getLuckyState(){
        return luckyState;
    }
    
    public int getCount(){
        return count;
    }
    
    public String toString() {
        return "Welcome to the Carnival! Know your fortune." + "\nJava-enabled Fortune Weighing Scale " + "\nInventory : " + this.count + " fortune messages\nMachine " + this.state;
    }
}

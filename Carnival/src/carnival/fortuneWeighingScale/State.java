/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package carnival.fortuneWeighingScale;

/**
 *
 * @author user
 */
public interface State {
    public void insertPenny();
    public void ejectPenny();
    public void pressButton();
    public void turnCrank();
    public void dispenseMsg();
}

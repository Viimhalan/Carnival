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
    public String insertPenny();
    public String ejectPenny();
    public String pressButton();
    public String turnCrank();
    public String dispenseMsg();
}

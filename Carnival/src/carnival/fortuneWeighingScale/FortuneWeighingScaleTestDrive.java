/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carnival.fortuneWeighingScale;

/**
 *
 * @author user
 */
public class FortuneWeighingScaleTestDrive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        FortuneWeighingScale fortuneWeighingScale = new FortuneWeighingScale(5);
//
//        System.out.println(fortuneWeighingScale);
//        System.out.println("");
//        
//        fortuneWeighingScale.insertPenny();
//        fortuneWeighingScale.pressButton();
//        fortuneWeighingScale.turnCrank();
//        
//        System.out.println("");
//        System.out.println(fortuneWeighingScale);
//        System.out.println("");
//        
//        fortuneWeighingScale.insertPenny();
//        fortuneWeighingScale.pressButton();
//        fortuneWeighingScale.turnCrank();
//        
//        System.out.println("");
//        System.out.println(fortuneWeighingScale);
//        System.out.println("");
//        
//        fortuneWeighingScale.insertPenny();
//        fortuneWeighingScale.pressButton();
//        fortuneWeighingScale.turnCrank();
//
//        System.out.println("");
//        System.out.println(fortuneWeighingScale);
//        System.out.println("");
//        
//        fortuneWeighingScale.insertPenny();
//        fortuneWeighingScale.pressButton();
//        fortuneWeighingScale.turnCrank();
//
//        System.out.println("");
//        System.out.println(fortuneWeighingScale);

        FortuneWeighingScale fortuneWeighingScale = new FortuneWeighingScale(5);

        System.out.println(fortuneWeighingScale.toString());
        System.out.println("");
        
        fortuneWeighingScale.insertPenny();
        System.out.println(fortuneWeighingScale.getHasPennyState());
//        fortuneWeighingScale.pressButton();
        fortuneWeighingScale.turnCrank();
        
        System.out.println("");
        System.out.println(fortuneWeighingScale);
        System.out.println("");
        
        fortuneWeighingScale.insertPenny();
//        fortuneWeighingScale.pressButton();
        fortuneWeighingScale.turnCrank();
        fortuneWeighingScale.insertPenny();
//        fortuneWeighingScale.pressButton();
        fortuneWeighingScale.turnCrank();

        System.out.println("");
        System.out.println(fortuneWeighingScale);
        System.out.println("");
        
        fortuneWeighingScale.insertPenny();
//        fortuneWeighingScale.pressButton();
        fortuneWeighingScale.turnCrank();

        System.out.println("");
        System.out.println(fortuneWeighingScale);

    }
    
}

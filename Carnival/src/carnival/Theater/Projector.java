/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carnival.Theater;

/**
 *
 * @author user
 */
public class Projector {
    public Projector() {}
    
    public String on() {
        return "Projector on";
    }
    
    public String off() {
        return "Projector off";
    }
    
    public String play(String movie) {
        return "Projector is going to play " + movie;
    }    
   
    public String stop() {
        return "Projector stopped ";
    }  
}

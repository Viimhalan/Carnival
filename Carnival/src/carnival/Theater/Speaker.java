/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carnival.Theater;

/**
 *
 * @author user
 */
public class Speaker {
    Film dvd;
    
    public Speaker(Film dvd) {
        this.dvd = dvd;
    }
            
    public String on() {
        return "Amplifier is on";
    }
    
    public String off() {
        return "Amplifier is off";
    }
    
    public String setVolume(int vol) {
        return "Amplifier is setting volume to " + vol;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carnival.Theater;

/**
 *
 * @author user
 */
public class CarnivalTestDrive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Film dvd = new Film();
        Projector projector = new Projector();
        Screen screen = new Screen();
        TheaterLights lights = new TheaterLights();
        User user = new User();
        
        Speaker speaker = new Speaker(dvd);
        
        CarnivalFacade homeTheater = new CarnivalFacade(speaker,dvd,projector,lights,screen,user);
        homeTheater.watchMovie("The Battleship Island");
        homeTheater.endMovie();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carnival.Theater;

/**
 *
 * @author user
 */
public class CarnivalFacade {
    Speaker speaker;
    Film film;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    User user;
    
    public CarnivalFacade(Speaker speaker,Film film,Projector projector,TheaterLights lights,Screen screen,User user) {
        this.speaker = speaker;
        this.film = film;
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;
        this.user = user;
    }
    
    public String watchMovie(String movie) {
        return "Welcome To Carnival Theater!!!" + "\n" +
                user.buyTicket() + "\n" + user.buySnacks() + "\n" + 
                user.seating() + "\n" + "Get ready to watch a movie..." + "\n" +
                lights.dim() + "\n" + screen.down() + "\n" + film.insert() + "\n" +
                projector.on() + "\n" + screen.wideScreenMode() + "\n" + speaker.on() + "\n" +
                speaker.setVolume(300) + "\n" + projector.play(movie) + "\n" + "Click the START button to play the movie";
    }
    
    public String endMovie() {
        return "Movie ended..." + "\n" + lights.on() + "\n" + projector.stop() + "\n" + 
                speaker.off() + "\n" + film.off() + "\n" + screen.up() + "\n" + "Click on the EXIT button to main page ";
    }
}

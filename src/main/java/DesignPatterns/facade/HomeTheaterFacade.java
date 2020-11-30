package main.java.DesignPatterns.facade;

public class HomeTheaterFacade {
    DvdPlayer dvdPlayer;
    Projector projector;
    Light light;
    Screen screen;

    public HomeTheaterFacade(DvdPlayer dvdPlayer, Projector projector, Light light, Screen screen) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.light = light;
        this.projector = projector;
        this.screen = screen;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        light.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        light.on();
        screen.up();
        projector.off();
        dvdPlayer.stop();
        dvdPlayer.off();
    }
}

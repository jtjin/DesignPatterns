package main.java.DesignPatterns.facade;

public class FacadeTest {
    public static void main(String[] args) {
        DvdPlayer dvdPlayer = new DvdPlayer();
        Projector projector = new Projector();
        Light light = new Light();
        Screen screen = new Screen();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, projector, light, screen);
        homeTheater.watchMovie("Raiders of  the Lost Ark");
        System.out.println();
        homeTheater.endMovie();
	}
}

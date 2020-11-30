package main.java.DesignPatterns.facade;

public class DvdPlayer {
    private String title = "";

    public void on() {
        System.out.println("DVD player on");
    }

    public void play(String title) {
        this.title = title;
        System.out.println("DVD player playing \"" + title + "\"");
    }

    public void stop() {
        System.out.println("DVD player stopped \"" + title + "\"");
    }

    public void eject() {
        title = "";
        System.out.println("DVD player eject");
    }

    public void off() {
        System.out.println("DVD player off");
    }
}

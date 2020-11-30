package main.java.DesignPatterns.facade;

public class Light {
    public void on() {
        System.out.println("Light on");
    }

    public void off() {
        System.out.println("Light off");
    }

    public void dim(int level) {
        System.out.println("Light dimming to " + level + "%");
    }
}

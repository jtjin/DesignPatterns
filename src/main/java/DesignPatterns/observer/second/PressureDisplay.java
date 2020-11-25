package main.java.DesignPatterns.observer.second;

import java.util.Observable;
import java.util.Observer;

public class PressureDisplay implements Observer, DisplayElement {
    private float pressure;
    private Observable obserable;

    public PressureDisplay(Observable obserable) {
        this.obserable = obserable;
        obserable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.pressure = weatherData.getPressure();
            display();
        }
    };

    @Override
    public void display() {
        System.out.println("From PressureDisplay: " + pressure + " psi");
    };
}

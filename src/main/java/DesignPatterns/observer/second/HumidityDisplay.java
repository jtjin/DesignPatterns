package main.java.DesignPatterns.observer.second;

import java.util.Observable;
import java.util.Observer;

public class HumidityDisplay implements Observer, DisplayElement {
    private float humidity;
    private Observable obserable;

    public HumidityDisplay(Observable obserable) {
        this.obserable = obserable;
        obserable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.humidity = weatherData.getHumidity();
            display();
        }
    };

    @Override
    public void display() {
        System.out.println("From HumidityDisplay: " + humidity + " %");
    };
}

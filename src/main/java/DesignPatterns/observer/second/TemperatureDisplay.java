package main.java.DesignPatterns.observer.second;

import java.util.Observable;
import java.util.Observer;

public class TemperatureDisplay implements Observer, DisplayElement {
    private float temperature;
    private Observable obserable;

    public TemperatureDisplay(Observable obserable) {
        this.obserable = obserable;
        obserable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            display();
        }
    };

    @Override
    public void display() {
        System.out.println("From TemperaturDisplay: " + temperature + " F degrees");
    };
}

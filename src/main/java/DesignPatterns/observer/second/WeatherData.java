package main.java.DesignPatterns.observer.second;

import java.util.Observable;

public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    };

    protected void measurementsChanged() {
        setChanged();
        notifyObservers();
    };

    protected void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    };

    protected float getTemperature() {
        return temperature;
    };

    protected float getHumidity() {
        return humidity;
    };

    protected float getPressure() {
        return pressure;
    };
}

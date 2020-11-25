package main.java.DesignPatterns.observer.first;

public class HumidityDisplay implements Observer, DisplayElement {
    private float humidity;
    private Subject weatherData;

    public HumidityDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.humidity = humidity;
        display();
    };

    @Override
    public void display() {
        System.out.println("From HumidityDisplay: " + humidity + " %");
    };
}

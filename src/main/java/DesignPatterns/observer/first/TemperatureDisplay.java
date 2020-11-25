package main.java.DesignPatterns.observer.first;

public class TemperatureDisplay implements Observer, DisplayElement {
    private float temperature;
    private Subject weatherData;

    public TemperatureDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        display();
    };

    @Override
    public void display() {
        System.out.println("From TemperaturDisplay: " + temperature + " F degrees");
    };
}

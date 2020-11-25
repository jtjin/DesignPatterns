package main.java.DesignPatterns.observer.first;

public class PressureDisplay implements Observer, DisplayElement {
    private float pressure;
    private Subject weatherData;

    public PressureDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.pressure = pressure;
        display();
    };

    @Override
    public void display() {
        System.out.println("From PressureDisplay: " + pressure + " psi");
    };
}

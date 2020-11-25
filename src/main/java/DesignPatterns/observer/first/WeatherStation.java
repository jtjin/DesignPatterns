package main.java.DesignPatterns.observer.first;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        TemperatureDisplay temperatureDisplay = new TemperatureDisplay(weatherData);
        HumidityDisplay humidityDisplay = new HumidityDisplay(weatherData);
        PressureDisplay pressureDisplay = new PressureDisplay(weatherData);

        System.out.println("1.");
        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println("2.");
        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println("3.");
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}

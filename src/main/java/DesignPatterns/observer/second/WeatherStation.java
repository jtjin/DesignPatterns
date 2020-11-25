package main.java.DesignPatterns.observer.second;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        TemperatureDisplay temperatureDisplay = new TemperatureDisplay(weatherData);
        HumidityDisplay humidityDisplay = new HumidityDisplay(weatherData);
        PressureDisplay pressureDisplay = new PressureDisplay(weatherData);

        System.out.println("1.");
        weatherData.setMeasurements(70, 55, 20.4f);
        System.out.println("2.");
        weatherData.setMeasurements(72, 60, 19.2f);
        System.out.println("3.");
        weatherData.setMeasurements(68, 80, 19.2f);
    }
}

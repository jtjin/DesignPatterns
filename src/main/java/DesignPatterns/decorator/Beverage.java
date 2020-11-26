package main.java.DesignPatterns.decorator;

public abstract class Beverage {
    public String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    };

    public abstract double cost();
}

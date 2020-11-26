package main.java.DesignPatterns.decorator;

public abstract class Beverage {
    protected String description = "Unknown Beverage";

    protected String getDescription() {
        return description;
    };

    protected abstract double cost();
}

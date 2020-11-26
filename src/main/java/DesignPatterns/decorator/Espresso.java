package main.java.DesignPatterns.decorator;

public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    };

    protected double cost() {
        return 1.99;
    }
}
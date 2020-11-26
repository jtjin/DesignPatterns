package main.java.DesignPatterns.decorator;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    };

    protected double cost() {
        return .89;
    }
}

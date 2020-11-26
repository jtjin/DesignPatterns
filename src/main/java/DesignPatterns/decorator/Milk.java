package main.java.DesignPatterns.decorator;

public class Milk extends CondimentDecorator {
    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    };

    @Override
    protected String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    protected double cost() {
        return beverage.cost() + .10;
    }
}
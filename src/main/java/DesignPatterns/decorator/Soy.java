package main.java.DesignPatterns.decorator;

public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    };

    @Override
    protected String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    protected double cost() {
        return beverage.cost() + .15;
    }
}
package main.java.DesignPatterns.decorator;

public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    };

    @Override
    protected String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    protected double cost() {
        return beverage.cost() + .20;
    }
}

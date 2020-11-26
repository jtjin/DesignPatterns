package main.java.DesignPatterns.factory.abstractFactory;

public class CheeseFactory extends AbstractFactory {
    @Override
    public NYStyle createNYStyle() {
        return new NYStyleCheesePizza();
    }

    @Override
    public ChicagoStyle createChicagoStyle() {
        return new ChicagoStyleCheesePizza();
    }
}

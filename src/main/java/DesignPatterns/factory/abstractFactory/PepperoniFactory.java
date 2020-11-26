package main.java.DesignPatterns.factory.abstractFactory;

public class PepperoniFactory extends AbstractFactory {
    @Override
    public NYStyle createNYStyle() {
        return new NYStylePepperoniPizza();
    }

    @Override
    public ChicagoStyle createChicagoStyle() {
        return new ChicagoStylePepperoniPizza();
    }
}
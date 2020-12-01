package main.java.DesignPatterns.factory.abstractFactory;

public abstract class AbstractFactory {
    public abstract NYStyle createNYStyle();

    public abstract ChicagoStyle createChicagoStyle();
}

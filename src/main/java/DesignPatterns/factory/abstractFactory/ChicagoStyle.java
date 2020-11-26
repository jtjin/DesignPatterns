package main.java.DesignPatterns.factory.abstractFactory;

public abstract class ChicagoStyle extends Pizza {
    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
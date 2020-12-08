package main.java.DesignPatterns.proxy;

public class Purchasing implements IPurchasing {
    @Override
    public void request() {
        System.out.println("Shopping in japan");
    }
}

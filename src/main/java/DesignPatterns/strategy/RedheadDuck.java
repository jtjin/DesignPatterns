package main.java.DesignPatterns.strategy;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    protected void disply() {
        System.out.println("I'm a redhead duck");
    }
}
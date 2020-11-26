package main.java.DesignPatterns.strategy;

public class RubberDuck extends Duck {
    public RubberDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Squeak());
    }

    public void disply() {
        System.out.println("I'm a rubber duck");
    }
}

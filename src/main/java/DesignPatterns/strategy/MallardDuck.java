package main.java.DesignPatterns.strategy;

public class MallardDuck extends Duck {
    public MallardDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    public void disply() {
        System.out.println("I'm a mallard duck");
    }
}
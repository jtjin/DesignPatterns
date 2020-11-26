package main.java.DesignPatterns.strategy;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }

    public void disply() {
        System.out.println("I'm a duck decoy");
    }
}

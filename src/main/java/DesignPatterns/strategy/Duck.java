package main.java.DesignPatterns.strategy;

public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public Duck() {
    };

    protected void swim() {
        System.out.println("All ducks can swim");
    }

    protected abstract void disply();

    protected void performQuack() {
        quackBehavior.quack();
    }

    protected void performFly() {
        flyBehavior.fly();
    }

    protected void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    protected void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}

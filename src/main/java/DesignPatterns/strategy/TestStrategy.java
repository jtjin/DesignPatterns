package main.java.DesignPatterns.strategy;

public class TestStrategy {
    public static void main(String[] args) {
        System.out.println("--- 1. Decoy Duck ---");
        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.disply();
        decoyDuck.swim();
        decoyDuck.performFly();
        decoyDuck.performQuack();

        System.out.println("--- 2. Mallard Duck ---");
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.disply();
        mallardDuck.swim();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        System.out.println("--- 3. Redhead Duck ---");
        RedheadDuck redheadDuck = new RedheadDuck();
        redheadDuck.disply();
        redheadDuck.swim();
        redheadDuck.performFly();
        redheadDuck.performQuack();

        System.out.println("--- 4. Rubber Duck ---");
        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.disply();
        rubberDuck.swim();
        rubberDuck.performFly();
        rubberDuck.performQuack();
    }
}

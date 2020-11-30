package main.java.DesignPatterns.adapter;

public class AdapterTest {
    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);
        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}

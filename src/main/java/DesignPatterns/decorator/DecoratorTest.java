package main.java.DesignPatterns.decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getDescription() + " $ " + beverage1.cost());

        Beverage beverage2 = new Soy((new Mocha(new HouseBlend())));
        System.out.println(beverage2.getDescription() + " $ " + beverage2.cost());

        Beverage beverage3 = new Milk(new Soy(new Mocha(new Espresso())));
        System.out.println(beverage3.getDescription() + " $ " + beverage3.cost());
    }
}

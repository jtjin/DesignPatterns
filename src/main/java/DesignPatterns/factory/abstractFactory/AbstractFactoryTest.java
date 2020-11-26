package main.java.DesignPatterns.factory.abstractFactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        Pizza pizza;
        AbstractFactory cheeseFactory = new CheeseFactory();
        AbstractFactory pepperoniFactory = new PepperoniFactory();

        pizza = cheeseFactory.createNYStyle();
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        System.out.println(pizza.getName() + " \n ");

        pizza = pepperoniFactory.createNYStyle();
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        System.out.println(pizza.getName() + " \n ");

        pizza = cheeseFactory.createChicagoStyle();
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        System.out.println(pizza.getName() + " \n ");

        pizza = pepperoniFactory.createChicagoStyle();
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        System.out.println(pizza.getName() + " \n ");
    }
}

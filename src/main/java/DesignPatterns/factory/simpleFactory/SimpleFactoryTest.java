package main.java.DesignPatterns.factory.simpleFactory;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        PizzaStore pizzaStore = new PizzaStore(simpleFactory);
        
        Pizza cheesePizza = pizzaStore.orderPizza("cheese");
        System.out.println("--------------------------");
        System.out.println("Your pizza is " + cheesePizza.getName());

        System.out.println();

        Pizza pepperoniPizza = pizzaStore.orderPizza("pepperoni");
        System.out.println("--------------------------");
        System.out.println("Your pizza is " + pepperoniPizza.getName());
    }
}

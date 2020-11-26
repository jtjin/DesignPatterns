package main.java.DesignPatterns.factory.factory;

public class FactoryTest {
    public static void main(String[] args) {
        Pizza pizza;
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        pizza = nyStore.orderPizza("cheese");
        System.out.println(pizza.getName() + " \n ");
        pizza = nyStore.orderPizza("pepperoni");
        System.out.println(pizza.getName() + " \n ");
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println(pizza.getName() + " \n ");
        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println(pizza.getName() + " \n ");
    }
}

package main.java.DesignPatterns.factory.simpleFactory;

public class SimpleFactory {
    private Pizza pizza = null;

    public Pizza createPizza(String type) {
        switch(type) {
            case "cheese":
            pizza = new CheesePizza();
            break;
            case "pepperoni":
            pizza = new PepperoniPizza();
            break;
        }
        return pizza;
    }
}

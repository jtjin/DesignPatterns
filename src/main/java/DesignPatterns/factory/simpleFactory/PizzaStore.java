package main.java.DesignPatterns.factory.simpleFactory;

public class PizzaStore {
    private SimpleFactory simpleFactory;

    public PizzaStore(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = simpleFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}

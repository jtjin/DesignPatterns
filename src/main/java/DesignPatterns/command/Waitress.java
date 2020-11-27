package main.java.DesignPatterns.command;

public class Waitress {
    private Order order;

    public void takeOrder(Order order) {
        this.order = order;
        order.orderUp();
    }
}

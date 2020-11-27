package main.java.DesignPatterns.command;

public class NuggetAndPotatoOrder implements Order {
    private Cook cook;

    public NuggetAndPotatoOrder(Cook cook) {
        this.cook = cook;
    }

    @Override
    public void orderUp() {
        cook.makeNugget();
        cook.makePotato();
    }
}
package main.java.DesignPatterns.command;

public class CommandTest {
  public static void main(String[] args) {
    Cook cook = new Cook();
    Waitress waitress = new Waitress();
    waitress.takeOrder(new BurgerAndFriesOrder(cook));
    waitress.takeOrder(new NuggetAndPotatoOrder(cook));
  }
}

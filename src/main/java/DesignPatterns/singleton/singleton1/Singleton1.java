package main.java.DesignPatterns.singleton.singleton1;

public class Singleton1 {
    private static Singleton1 instance = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        return instance;
    }

    // For test
    private int value = 100;

    public void addValue(int value) {
        this.value += value;
    }

    public int getValue() {
        return value;
    }
}

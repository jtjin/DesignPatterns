package main.java.DesignPatterns.singleton.singleton2;

public class Singleton2 {
    private static Singleton2 instance;

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        if (instance == null) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            instance = new Singleton2();
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

package main.java.DesignPatterns.singleton.singleton3;

public class Singleton3 {
    private static Singleton3 instance;

    private Singleton3() {
    }

    public synchronized static Singleton3 getInstance() {
        if (instance == null) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            instance = new Singleton3();
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

package main.java.DesignPatterns.singleton.singleton4;

public class Singleton4 {
    private volatile static Singleton4 instance;

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        if (instance == null) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            synchronized (Singleton4.class) {
                if (instance == null) {
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                    instance = new Singleton4();
                }
            }
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

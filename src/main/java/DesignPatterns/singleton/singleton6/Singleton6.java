package main.java.DesignPatterns.singleton.singleton6;

public enum Singleton6 {
    INSTANCE;

    // For test
    private int value = 100;

    public void addValue(int value) {
        this.value += value;
    }

    public int getValue() {
        return value;
    }
}

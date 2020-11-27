package main.java.DesignPatterns.singleton.singleton2;

public class SingletonThread extends Thread {
    private int number;

    public SingletonThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        Singleton2 singleton2 = Singleton2.getInstance();
        singleton2.addValue(50);
        System.out.println("Thread " + number + " : " + singleton2.getValue());
    }
}
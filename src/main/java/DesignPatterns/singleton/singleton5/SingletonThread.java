package main.java.DesignPatterns.singleton.singleton5;

public class SingletonThread extends Thread {
    private int number;

    public SingletonThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        Singleton5 singleton5 = Singleton5.getInstance();
        singleton5.addValue(50);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println("Thread " + number + " : " + singleton5.getValue());
    }
}
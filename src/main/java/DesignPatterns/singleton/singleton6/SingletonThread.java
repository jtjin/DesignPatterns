package main.java.DesignPatterns.singleton.singleton6;

public class SingletonThread extends Thread {
    private int number;

    public SingletonThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        Singleton6 singleton6 = Singleton6.INSTANCE;
        singleton6.addValue(50);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println("Thread " + number + " : " + singleton6.getValue());
    }
}
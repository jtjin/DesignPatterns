package main.java.DesignPatterns.singleton.singleton1;

public class SingletonThread extends Thread {
    private int number;

    public SingletonThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        Singleton1 singleton1 = Singleton1.getInstance();
        singleton1.addValue(50);
        try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
        System.out.println("Thread " + number + " : " + singleton1.getValue());
    }
}
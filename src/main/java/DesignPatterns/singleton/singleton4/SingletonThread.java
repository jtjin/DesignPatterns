package main.java.DesignPatterns.singleton.singleton4;

public class SingletonThread extends Thread {
    private int number;

    public SingletonThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        Singleton4 singleton4 = Singleton4.getInstance();
        singleton4.addValue(50);
        try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
        System.out.println("Thread " + number + " : " + singleton4.getValue());
    }
}
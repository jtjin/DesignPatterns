package main.java.DesignPatterns.singleton.singleton3;

public class SingletonThread extends Thread {
    private int number;

    public SingletonThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        Singleton3 singleton3 = Singleton3.getInstance();
        singleton3.addValue(50);
        try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
        System.out.println("Thread " + number + " : " + singleton3.getValue());
    }
}
package main.java.DesignPatterns.singleton.singleton2;

public class SingletonTest {
    public static void main(String args[]) {
        Thread t1 = new SingletonThread(1);
        Thread t2 = new SingletonThread(2);
        t1.start();
        t2.start();
    }
}

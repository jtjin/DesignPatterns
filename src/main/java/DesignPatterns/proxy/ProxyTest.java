package main.java.DesignPatterns.proxy;

public class ProxyTest {
    public static void main(String args[]) {
        IPurchasing proxy = new ProxyBuyer();
        proxy.request();
    }
}

package main.java.DesignPatterns.proxy;

public class ProxyBuyer implements IPurchasing{
    private Purchasing purchasing;

    @Override
    public void request() {
        if (purchasing == null) {
            purchasing = new Purchasing();
        }
        preRequest();
        purchasing.request();
        postRequest();
    }

    public void preRequest() {
        System.out.println("Confirm shopping items");
        System.out.println("Record the number of purchasers");
    }

    public void postRequest() {
        System.out.println("delivery");
    }
}

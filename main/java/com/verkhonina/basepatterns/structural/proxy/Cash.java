package main.java.com.verkhonina.basepatterns.structural.proxy;

public class Cash implements Payment {


    public Cash() {
        getCash();
    }

    public void getCash() {
        System.out.println("Get money from the bank");
    }

    @Override
    public void pay() {
        System.out.println("Pay by cash...");
    }
}

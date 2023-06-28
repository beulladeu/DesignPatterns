package main.java.com.verkhonina.basepatterns.structural.proxy;

public class BankCheckRunner {
    public static void main(String[] args) {
        Payment payment = new BankCheck();

        payment.pay();
    }
}

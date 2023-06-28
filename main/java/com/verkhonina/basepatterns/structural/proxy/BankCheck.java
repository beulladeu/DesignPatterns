package main.java.com.verkhonina.basepatterns.structural.proxy;

//proxy class
public class BankCheck implements Payment{

    private Cash cash;

    @Override
    public void pay() {
        if (cash == null) {
            cash = new Cash();
        }
        cash.pay();
    }
}

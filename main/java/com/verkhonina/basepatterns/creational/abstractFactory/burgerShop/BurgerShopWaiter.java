package main.java.com.verkhonina.basepatterns.creational.abstractFactory.burgerShop;

import main.java.com.verkhonina.basepatterns.creational.abstractFactory.Waiter;

public class BurgerShopWaiter implements Waiter {
    @Override
    public void acceptOrder() {
        System.out.println("BurgerShop waiter accepts orders");
    }
}

package main.java.com.verkhonina.basepatterns.creational.abstractFactory.burgerShop;

import main.java.com.verkhonina.basepatterns.creational.abstractFactory.Manager;

public class BurgerShopManager implements Manager {
    @Override
    public void manageCafe() {
        System.out.println("Manager manages BurgerShop");
    }
}

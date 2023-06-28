package main.java.com.verkhonina.basepatterns.creational.abstractFactory.burgerShop;

import main.java.com.verkhonina.basepatterns.creational.abstractFactory.Chef;

public class BurgerShopChef implements Chef {
    @Override
    public void cook() {
        System.out.println("Chef cooks burgers");
    }
}

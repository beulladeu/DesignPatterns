package main.java.com.verkhonina.basepatterns.creational.abstractFactory;

import main.java.com.verkhonina.basepatterns.creational.abstractFactory.burgerShop.BurgerShopFactory;

public class BurgerShop {
    public static void main(String[] args) {
        CafeTeamFactory team = new BurgerShopFactory();
        Chef chef = team.getChef();
        Waiter waiter = team.getWaiter();
        Manager manager = team.getManager();

        waiter.acceptOrder();
        chef.cook();
        manager.manageCafe();
    }
}

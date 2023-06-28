package main.java.com.verkhonina.basepatterns.creational.abstractFactory;

import main.java.com.verkhonina.basepatterns.creational.abstractFactory.pizzaShop.PizzaShopFactory;

public class PizzaShop {
    public static void main(String[] args) {
        CafeTeamFactory team = new PizzaShopFactory();
        Chef chef = team.getChef();
        Waiter waiter = team.getWaiter();
        Manager manager = team.getManager();

        waiter.acceptOrder();
        chef.cook();
        manager.manageCafe();
    }
}

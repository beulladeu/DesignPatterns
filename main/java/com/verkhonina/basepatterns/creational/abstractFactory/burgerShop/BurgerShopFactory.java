package main.java.com.verkhonina.basepatterns.creational.abstractFactory.burgerShop;

import main.java.com.verkhonina.basepatterns.creational.abstractFactory.CafeTeamFactory;
import main.java.com.verkhonina.basepatterns.creational.abstractFactory.Chef;
import main.java.com.verkhonina.basepatterns.creational.abstractFactory.Manager;
import main.java.com.verkhonina.basepatterns.creational.abstractFactory.Waiter;

public class BurgerShopFactory implements CafeTeamFactory {
    @Override
    public Waiter getWaiter() {
        return new BurgerShopWaiter();
    }

    @Override
    public Chef getChef() {
        return new BurgerShopChef();
    }

    @Override
    public Manager getManager() {
        return new BurgerShopManager();
    }
}

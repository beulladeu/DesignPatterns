package main.java.com.verkhonina.basepatterns.creational.abstractFactory.pizzaShop;

import main.java.com.verkhonina.basepatterns.creational.abstractFactory.CafeTeamFactory;
import main.java.com.verkhonina.basepatterns.creational.abstractFactory.Chef;
import main.java.com.verkhonina.basepatterns.creational.abstractFactory.Manager;
import main.java.com.verkhonina.basepatterns.creational.abstractFactory.Waiter;

public class PizzaShopFactory implements CafeTeamFactory {

    @Override
    public Waiter getWaiter() {
        return new PizzaWaiter();
    }

    @Override
    public Chef getChef() {
        return new PizzaMaker();
    }

    @Override
    public Manager getManager() {
        return new PizzaManager();
    }
}

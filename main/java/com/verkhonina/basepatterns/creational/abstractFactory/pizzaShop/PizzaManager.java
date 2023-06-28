package main.java.com.verkhonina.basepatterns.creational.abstractFactory.pizzaShop;

import main.java.com.verkhonina.basepatterns.creational.abstractFactory.Manager;

public class PizzaManager implements Manager {

    @Override
    public void manageCafe() {
        System.out.println("Manager runs a PizzaShop");
    }
}

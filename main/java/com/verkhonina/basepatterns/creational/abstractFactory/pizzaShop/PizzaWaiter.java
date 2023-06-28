package main.java.com.verkhonina.basepatterns.creational.abstractFactory.pizzaShop;

import main.java.com.verkhonina.basepatterns.creational.abstractFactory.Waiter;

public class PizzaWaiter implements Waiter {
    @Override
    public void acceptOrder() {
        System.out.println("Waiter recommends pizzas and accepts orders");
    }
}

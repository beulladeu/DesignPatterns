package main.java.com.verkhonina.basepatterns.creational.abstractFactory.pizzaShop;

import main.java.com.verkhonina.basepatterns.creational.abstractFactory.Chef;

public class PizzaMaker implements Chef {
    @Override
    public void cook() {
        System.out.println("Pizzamaker cooks pizza");
    }
}

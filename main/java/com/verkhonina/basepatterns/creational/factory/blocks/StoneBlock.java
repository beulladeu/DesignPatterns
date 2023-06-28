package main.java.com.verkhonina.basepatterns.creational.factory.blocks;

import main.java.com.verkhonina.basepatterns.creational.factory.Block;

public class StoneBlock implements Block {

    @Override
    public void move() {
        System.out.println("Каменный блок передвинут");
    }

    @Override
    public boolean destroy() {
        System.out.println("Каменный блок разрушен");
        return true;
    }

    @Override
    public void put() {
        System.out.println("Каменный блок поставлен");
    }
}

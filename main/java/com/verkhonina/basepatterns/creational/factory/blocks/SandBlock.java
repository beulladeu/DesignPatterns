package main.java.com.verkhonina.basepatterns.creational.factory.blocks;

import main.java.com.verkhonina.basepatterns.creational.factory.Block;

public class SandBlock implements Block {
    @Override
    public void move() {
        System.out.println("Песчанный блок передвинут");
    }

    @Override
    public boolean destroy() {
        System.out.println("Песчанный блок разрушен");
        return true;
    }

    @Override
    public void put() {
        System.out.println("Песчанный блок поставлен");
    }
}

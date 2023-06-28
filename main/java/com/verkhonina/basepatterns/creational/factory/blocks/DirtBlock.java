package main.java.com.verkhonina.basepatterns.creational.factory.blocks;

import main.java.com.verkhonina.basepatterns.creational.factory.Block;

public class DirtBlock implements Block {
    @Override
    public void move() {
        System.out.println("Блок земли передвинут");
    }

    @Override
    public boolean destroy() {
        System.out.println("Блок земли разрушен");
        return true;
    }

    @Override
    public void put() {
        System.out.println("Блок земли поставлен");
    }
}

package main.java.com.verkhonina.basepatterns.behavioral.observer;

import java.util.List;

public class Subscriber implements Observer {

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> promos) {
        System.out.println("Dear " + name);
        System.out.println("We have some changes in membership promos:");
        System.out.println(promos);
        System.out.println("------------------------------------------");
    }
}

package main.java.com.verkhonina.basepatterns.behavioral.iterator;

public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public void heal() {
        System.out.println("Player " + name + " is healing...");
    }
}

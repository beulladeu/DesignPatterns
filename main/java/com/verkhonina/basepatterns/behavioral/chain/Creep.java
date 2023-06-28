package main.java.com.verkhonina.basepatterns.behavioral.chain;

public class Creep extends Enemy{
    public Creep(int enemyType) {
        super(enemyType);
    }

    @Override
    public void fight() {
        System.out.println("Fighting with creep...");
    }
}

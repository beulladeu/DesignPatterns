package main.java.com.verkhonina.basepatterns.behavioral.chain;

public class Boss extends Enemy {
    public Boss(int enemyType) {
        super(enemyType);
    }

    @Override
    public void fight() {
        System.out.println("Fighting with boss...");
    }
}

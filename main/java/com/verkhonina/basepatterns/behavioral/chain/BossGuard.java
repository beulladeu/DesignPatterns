package main.java.com.verkhonina.basepatterns.behavioral.chain;

public class BossGuard extends Enemy {
    public BossGuard(int enemyType) {
        super(enemyType);
    }

    @Override
    public void fight() {
        System.out.println("Fighting with boss guard...");
    }
}

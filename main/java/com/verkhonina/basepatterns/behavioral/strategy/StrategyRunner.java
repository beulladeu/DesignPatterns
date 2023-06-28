package main.java.com.verkhonina.basepatterns.behavioral.strategy;

public class StrategyRunner {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setActivity(new LevelStarting());
        hero.doActivity();

        hero.setActivity(new BossFighting());
        hero.doActivity();

        hero.setActivity(new LevelEnding());
        hero.doActivity();
    }
}

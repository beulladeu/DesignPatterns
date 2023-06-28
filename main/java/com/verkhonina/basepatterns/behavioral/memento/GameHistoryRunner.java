package main.java.com.verkhonina.basepatterns.behavioral.memento;

public class GameHistoryRunner {
    public static void main(String[] args) {
        GameHistory history = new GameHistory();

        System.out.println("Starting game with hero:");
        Hero hero = new Hero("Zelda", 1,  125);
        System.out.println("=============");

        System.out.println("Autosaving...");
        HeroSnapshot startLevelState = hero.save();
        history.setSave(startLevelState);
        System.out.println(hero);

        System.out.println("=============");
        System.out.println("Fighting with enemy... Health is down...");
        int downHealth = hero.getHealth() - 25;
        hero.setHealth(downHealth);

        System.out.println("=============");
        System.out.println("Autosaving...");
        history.setSave(hero.save());
        System.out.println(hero);

        System.out.println("=============");
        System.out.println("Hero is dead... Level start again...");

        hero.load(startLevelState);
        System.out.println(hero);
    }
}

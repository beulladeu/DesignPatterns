package main.java.com.verkhonina.basepatterns.behavioral.memento;

public class GameHistory {
    private HeroSnapshot hero;

    public void setSave(HeroSnapshot hero) {
        this.hero = hero;
    }

    public HeroSnapshot getSave() {
        return hero;
    }
}

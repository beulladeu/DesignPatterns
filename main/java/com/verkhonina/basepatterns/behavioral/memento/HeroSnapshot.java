package main.java.com.verkhonina.basepatterns.behavioral.memento;

public class HeroSnapshot {
    private final String name;
    private final int level;
    private final int health;

    public HeroSnapshot(String name, int level, int health) {
        this.name = name;
        this.level = level;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }
}

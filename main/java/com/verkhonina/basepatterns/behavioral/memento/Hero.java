package main.java.com.verkhonina.basepatterns.behavioral.memento;

public class Hero {
    private String name;
    private int level;
    private int health;

    public Hero(String name, int level, int health) {
        this.name = name;
        this.level = level;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public HeroSnapshot save() {
        return new HeroSnapshot(name, level, health);
    }

    public void load(HeroSnapshot snapshot) {
        this.name = snapshot.getName();
        this.health = snapshot.getHealth();
        this.level = snapshot.getLevel();
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", health=" + health +
                '}';
    }
}

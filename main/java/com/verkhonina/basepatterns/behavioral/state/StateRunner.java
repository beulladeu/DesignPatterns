package main.java.com.verkhonina.basepatterns.behavioral.state;

public class StateRunner {
    public static void main(String[] args) {
        Activity activity = new LevelStarting();

        Hero hero = new Hero();
        hero.setActivity(activity);

        for (int i = 0; i < 12; i++) {
            hero.doActivity();
            hero.changeActivity();
        }
    }
}

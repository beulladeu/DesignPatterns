package main.java.com.verkhonina.basepatterns.behavioral.template;

public abstract class GameTemplate {

    public void run() {
        System.out.println("Game initializing...");
        runContextLogic();
        System.out.println("Saving game...");
    }

    public abstract void runContextLogic();
}

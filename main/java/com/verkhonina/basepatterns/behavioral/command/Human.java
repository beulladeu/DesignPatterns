package main.java.com.verkhonina.basepatterns.behavioral.command;

public class Human {
    private Command walk;
    private Command jump;


    public Human(Command walk, Command jump) {
        this.walk= walk;
        this.jump = jump;
    }

    public void walk() {
        walk.execute();
    }

    public void jump() {
        jump.execute();
    }
}

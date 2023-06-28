package main.java.com.verkhonina.basepatterns.behavioral.command;

public class WalkCommand implements Command {
    Movement movement;

    public WalkCommand(Movement movement) {
        this.movement = movement;
    }

    @Override
    public void execute() {
        movement.walk();
    }
}

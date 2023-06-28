package main.java.com.verkhonina.basepatterns.behavioral.command;

public class JumpCommand implements Command {
    Movement movement;

    public JumpCommand(Movement movement) {
        this.movement = movement;
    }

    @Override
    public void execute() {
        movement.jump();
    }
}

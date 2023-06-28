package main.java.com.verkhonina.basepatterns.behavioral.command;

public class HumanMovementRunner {
    public static void main(String[] args) {

        Movement movement = new Movement();

        Human human = new Human(
                new WalkCommand(movement),
                new JumpCommand(movement)
        );

        human.jump();
        human.walk();
    }
}

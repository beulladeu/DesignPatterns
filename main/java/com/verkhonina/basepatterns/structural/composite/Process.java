package main.java.com.verkhonina.basepatterns.structural.composite;

import java.util.LinkedList;
import java.util.List;

public class Process implements Task {

    private final List<Task> tasks = new LinkedList<>();

    @Override
    public void run() {
        for (Task task: tasks) {
            task.run();
        }
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }
}

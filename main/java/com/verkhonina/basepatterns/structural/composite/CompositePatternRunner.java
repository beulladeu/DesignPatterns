package main.java.com.verkhonina.basepatterns.structural.composite;

public class CompositePatternRunner {
    public static void main(String[] args) {
        Task startTask = new StartTask();
        Task scriptTask1 = new ScriptTask();
        Task scriptTask2 = new ScriptTask();

        Process process = new Process();
        process.addTask(startTask);
        process.addTask(scriptTask1);
        process.addTask(scriptTask2);

        process.run();
    }
}

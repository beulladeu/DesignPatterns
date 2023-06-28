package main.java.com.verkhonina.basepatterns.structural.composite;

public class ScriptTask implements Task{
    @Override
    public void run() {
        System.out.println("Script task runs script");
    }
}

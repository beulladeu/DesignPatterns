package main.java.com.verkhonina.basepatterns.structural.facade;

public class Current {
    private boolean hasCurrent;


    public boolean isHasCurrent() {
        return hasCurrent;
    }

    public void start() {
        System.out.println("current flows...");
        hasCurrent = true;
    }

    public void finish() {
        System.out.println("current stopped flowing...");
        hasCurrent = false;
    }
}

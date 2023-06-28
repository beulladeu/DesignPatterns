package main.java.com.verkhonina.basepatterns.structural.composite;

public class StartTask implements Task {

    @Override
    public void run() {
        System.out.println("Start task runs init action");
    }
}

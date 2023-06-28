package main.java.com.verkhonina.basepatterns.behavioral.state;

public class Death implements Activity{
    @Override
    public void doActivity() {
        System.out.println("Death...");
    }
}

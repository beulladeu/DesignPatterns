package main.java.com.verkhonina.basepatterns.structural.bridge;

public class TVRemoteController implements RemoteController{
    @Override
    public void turnOn() {
        System.out.println("TV remote controller turned up TV");
    }
}

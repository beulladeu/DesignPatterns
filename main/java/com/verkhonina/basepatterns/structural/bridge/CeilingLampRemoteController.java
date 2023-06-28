package main.java.com.verkhonina.basepatterns.structural.bridge;

public class CeilingLampRemoteController implements RemoteController{

    @Override
    public void turnOn() {
        System.out.println("Ceiling lamp remote controller turned up TV");
    }
}

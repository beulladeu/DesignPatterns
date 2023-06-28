package main.java.com.verkhonina.basepatterns.structural.bridge;

public class Television extends RadioEquipment {

    public Television(RemoteController remoteController) {
        super(remoteController);
    }

    @Override
    public void turnUp() {
        System.out.println("TV is turning up");
        remoteController.turnOn();
    }
}

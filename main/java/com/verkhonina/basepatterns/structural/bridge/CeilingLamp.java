package main.java.com.verkhonina.basepatterns.structural.bridge;

public class CeilingLamp extends RadioEquipment{
    public CeilingLamp(RemoteController remoteController) {
        super(remoteController);
    }

    @Override
    public void turnUp() {
        System.out.println("Ceiling lamp is turning up");
        remoteController.turnOn();
    }
}

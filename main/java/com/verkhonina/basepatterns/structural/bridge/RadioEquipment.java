package main.java.com.verkhonina.basepatterns.structural.bridge;

public abstract class RadioEquipment {

    protected RemoteController remoteController;


    public RadioEquipment(RemoteController remoteController) {
        this.remoteController = remoteController;
    }

    public abstract void turnUp();
}

package main.java.com.verkhonina.basepatterns.structural.bridge;

public class RadioEquipmentRunner {
    public static void main(String[] args) {
        RadioEquipment[] equipments = {
                new Television(new TVRemoteController()),
                new CeilingLamp(new CeilingLampRemoteController())
        };

        for (RadioEquipment eq: equipments) {
            eq.turnUp();
        }
    }
}

package main.java.com.verkhonina.basepatterns.structural.facade;

public class Microchip {
    private QuartzCrystal quartzCrystal;
    private long seconds = 0;

    public Microchip(QuartzCrystal quartzCrystal) {
        this.quartzCrystal = quartzCrystal;
    }

    public long getSeconds() {
        return seconds;
    }

    public long countSeconds() {
        int counter = 60;
        while (counter >= 0) {
            int vibrate = quartzCrystal.vibrate();
            if (vibrate == 0) {
                throw new RuntimeException("current is not flowing");
            }
            counter = counter - quartzCrystal.vibrate();
        }
        seconds++;
        return seconds;
    }
}

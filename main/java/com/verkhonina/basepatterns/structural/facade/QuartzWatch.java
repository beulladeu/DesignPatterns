package main.java.com.verkhonina.basepatterns.structural.facade;

public class QuartzWatch {
    private Current current;
    private QuartzCrystal quartzCrystal;
    private Microchip microchip;

    private WatchDisplay display;


    public QuartzWatch(Current current) {
        this.current = current;
        quartzCrystal = new QuartzCrystal(current);
        microchip = new Microchip(quartzCrystal);
        display = new WatchDisplay();
    }

    public void start() {
        System.out.println("Quartz watch start working");
        long seconds = 0;
        while(current.isHasCurrent()) {
            seconds = microchip.countSeconds();
            display.showTime(seconds);
        }
    }
}

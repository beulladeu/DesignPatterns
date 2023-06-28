package main.java.com.verkhonina.basepatterns.structural.facade;

public class QuartzCrystal {
    private Current current;

    public QuartzCrystal(Current current) {
        this.current = current;
    }

    public int vibrate() {
        if(current.isHasCurrent()) {
            System.out.println("quartz crystal vibrates with frequency 32 768 Hz");
            return 1;
        } else {
            System.out.println("quartz crystal doesn't vibrate without current");
            return 0;
        }
    }
}

package main.java.com.verkhonina.basepatterns.structural.facade;

public class QuartzWatchRunner {
    public static void main(String[] args){
        Current current = new Current();
        current.start();

        QuartzWatch watch = new QuartzWatch(current);
        watch.start();
    }
}

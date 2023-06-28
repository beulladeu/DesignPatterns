package main.java.com.verkhonina.basepatterns.behavioral.strategy;

public class Hero {

    private Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
    public void doActivity() {
        activity.doActivity();
    }

}

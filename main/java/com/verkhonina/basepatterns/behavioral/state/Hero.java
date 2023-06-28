package main.java.com.verkhonina.basepatterns.behavioral.state;

public class Hero {

    private Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity() {
        if (activity instanceof LevelStarting) {
            setActivity(new BossFighting());
        } else if (activity instanceof Death) {
            setActivity(new LevelStarting());
        } else if (activity instanceof BossFighting) {
            setActivity(new LevelEnding());
        } else if (activity instanceof LevelEnding) {
            setActivity(new LevelStarting());
        }
    }

    public void doActivity() {
        activity.doActivity();
    }

}

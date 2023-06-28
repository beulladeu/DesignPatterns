package main.java.com.verkhonina.basepatterns.structural.flyweight;

public abstract class Flat {

    private boolean isBusy;

    abstract boolean busy();

    abstract void free();

    public boolean isBusy() {
        return isBusy;
    }

    public void setBusy(boolean busy) {
        isBusy = busy;
    }
}

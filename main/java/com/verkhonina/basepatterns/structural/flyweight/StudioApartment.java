package main.java.com.verkhonina.basepatterns.structural.flyweight;

public class StudioApartment extends Flat{

    @Override
    public boolean busy() {
        if (!isBusy()) {
            System.out.println("Studio apartment renting...");
            setBusy(true);
            return true;
        } else {
            System.out.println("Impossible to rent studio apartment");
            return false;
        }
    }

    @Override
    public void free() {
        System.out.println("Studio apartment is free...");
        setBusy(false);
    }
}

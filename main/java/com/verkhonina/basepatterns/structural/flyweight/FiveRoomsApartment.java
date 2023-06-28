package main.java.com.verkhonina.basepatterns.structural.flyweight;

public class FiveRoomsApartment extends Flat {
    @Override
    public boolean busy() {
        if (!isBusy()) {
            System.out.println("Five rooms apartment renting...");
            setBusy(true);
            return true;
        } else {
            System.out.println("Impossible to rent five rooms apartment");
            return false;
        }
    }

    @Override
    public void free() {
        System.out.println("Five rooms apartment is free...");
        setBusy(false);
    }
}

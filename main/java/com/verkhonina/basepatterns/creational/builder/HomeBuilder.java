package main.java.com.verkhonina.basepatterns.creational.builder;

public abstract class HomeBuilder {
    Home home;

    void buildHome() {
        home = new Home();
    }

    abstract void buildHomeName();
    abstract void buildRoomsNumber();
    abstract void buildHasBasement();
    abstract void buildRoofType();
    abstract void buildWallsColor();
    abstract void buildHasSwimmingPool();
    abstract void buildHasBackyard();

    Home getHome() {
        return home;
    }
}

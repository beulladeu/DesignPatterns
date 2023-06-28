package main.java.com.verkhonina.basepatterns.creational.builder;

public class PrivateResidence extends HomeBuilder {
    @Override
    void buildHomeName() {
        home.setHomeName("Резиденция");
    }

    @Override
    void buildRoomsNumber() {
        home.setRoomsNumber(10);
    }

    @Override
    void buildHasBasement() {
        home.setHasBasement(true);
    }

    @Override
    void buildRoofType() {
        home.setRoofType("Мансардная");
    }

    @Override
    void buildWallsColor() {
        home.setWallsColor("Белый");
    }

    @Override
    void buildHasSwimmingPool() {
        home.setHasSwimmingPool(true);
    }

    @Override
    void buildHasBackyard() {
        home.setHasBackyard(true);
    }
}

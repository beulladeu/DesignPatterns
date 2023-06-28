package main.java.com.verkhonina.basepatterns.creational.builder;

public class ApartmentHouse extends HomeBuilder {
    @Override
    void buildHomeName() {
        home.setHomeName("Многоквартирный дом");
    }

    @Override
    void buildRoomsNumber() {
        home.setRoomsNumber(1000);
    }

    @Override
    void buildHasBasement() {
        home.setHasBasement(true);
    }

    @Override
    void buildRoofType() {
        home.setRoofType("Плоская");
    }

    @Override
    void buildWallsColor() {
        home.setWallsColor("Бежевый");
    }

    @Override
    void buildHasSwimmingPool() {
        home.setHasSwimmingPool(true);
    }

    @Override
    void buildHasBackyard() {

    }
}

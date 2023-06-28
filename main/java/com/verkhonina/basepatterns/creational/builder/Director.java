package main.java.com.verkhonina.basepatterns.creational.builder;

public class Director {
    HomeBuilder homeBuilder;

    public void setHomeBuilder(HomeBuilder homeBuilder) {
        this.homeBuilder = homeBuilder;
    }

    Home buildHome() {
        homeBuilder.buildHome();
        homeBuilder.buildHomeName();
        homeBuilder.buildHasBasement();
        homeBuilder.buildHasSwimmingPool();
        homeBuilder.buildRoofType();
        homeBuilder.buildWallsColor();
        homeBuilder.buildRoomsNumber();
        homeBuilder.buildHasBackyard();

        return homeBuilder.getHome();
    }
}

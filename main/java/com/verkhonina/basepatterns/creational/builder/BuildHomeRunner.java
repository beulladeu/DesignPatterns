package main.java.com.verkhonina.basepatterns.creational.builder;

public class BuildHomeRunner {

    public static void main(String[] args) {
        Director director = new Director();
        director.setHomeBuilder(new ApartmentHouse());
        Home home = director.buildHome();

        System.out.println(home);
    }
}

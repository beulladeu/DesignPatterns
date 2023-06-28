package main.java.com.verkhonina.basepatterns.creational.abstractFactory;

public interface CafeTeamFactory {

    Waiter getWaiter();

    Chef getChef();

    Manager getManager();

}

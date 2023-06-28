package main.java.com.verkhonina.basepatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class FitnessStudio implements Observed {

    private List<String> promos = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public void addPromo(String promo) {
        promos.add(promo);
        notifyObservers();
    }

    public void removePromo(String promo) {
        promos.remove(promo);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.handleEvent(promos);
        }
    }
}

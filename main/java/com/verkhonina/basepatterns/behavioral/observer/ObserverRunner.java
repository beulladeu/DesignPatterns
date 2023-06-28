package main.java.com.verkhonina.basepatterns.behavioral.observer;

public class ObserverRunner {
    public static void main(String[] args) {
        FitnessStudio fitnessStudio = new FitnessStudio();

        fitnessStudio.addPromo("-50% for beginners");
        fitnessStudio.addPromo("1+1=1");

        Observer subscriber1 = new Subscriber("Vladislava");
        Observer subscriber2 = new Subscriber("Mikhail");
        Observer subscriber3 = new Subscriber("Nikita");

        fitnessStudio.addObserver(subscriber1);
        fitnessStudio.addObserver(subscriber2);
        fitnessStudio.addObserver(subscriber3);

        fitnessStudio.addPromo("-30% for year membership");

        fitnessStudio.removePromo("1+1=1");
    }
}

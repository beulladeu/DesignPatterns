package main.java.com.verkhonina.basepatterns.structural.adapter;

public class AdapterRunner {
    public static void main(String[] args) {
        DogToMuteDogAdapter muteDog = new DogToMuteDogAdapter();

        muteDog.scratchWithPaw();
    }
}

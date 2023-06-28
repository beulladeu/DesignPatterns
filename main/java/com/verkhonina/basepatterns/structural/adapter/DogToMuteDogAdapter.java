package main.java.com.verkhonina.basepatterns.structural.adapter;

public class DogToMuteDogAdapter extends Dog implements MuteDog {

    @Override
    public void scratchWithPaw() {
        sayGav();
    }
}

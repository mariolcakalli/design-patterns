package design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class ToyCollection implements Toy {
    private final List<Toy> toys;

    public ToyCollection() {
        toys = new ArrayList<>();
    }

    public void add(Toy toy) {
        toys.add(toy);
    }

    public void remove(Toy toy) {
        toys.remove(toy);
    }

    public void play() {
        System.out.println("Playing with the toy collection");
        for (Toy toy : toys) {
            toy.play();
        }
    }
}

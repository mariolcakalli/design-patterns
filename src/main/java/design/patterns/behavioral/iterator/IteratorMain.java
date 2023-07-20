package design.patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class IteratorMain {
    public static void main(String[] args) {
        List<Toy> toys = new ArrayList<>();
        toys.add(new Toy("Teddy Bear"));
        toys.add(new Toy("Doll"));
        toys.add(new Toy("Car"));

        ToyBox toyBox = new ToyBox(toys);

        for (Toy toy : toyBox) {
            System.out.println("Playing with " + toy.getName());
        }
    }
}

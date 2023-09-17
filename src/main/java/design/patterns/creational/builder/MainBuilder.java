package design.patterns.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class MainBuilder {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Max");
        dog.setAge(1);
        dog.setType("Golden Retreiver");

        List<String> toys = new ArrayList<>();
        toys.add("1");
        toys.add("2");

        dog.setToys(toys);


        Dog d1 = new Dog.DogBuilder()
                .withName("Charlie")
                .withAge(3)
                .withType("Labrador")
                .withToy("1")
                .withToy("2")
                .build();
        System.out.println(d1);
    }
}

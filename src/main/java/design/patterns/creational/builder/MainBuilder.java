package design.patterns.creational.builder;

public class MainBuilder {
    public static void main(String[] args) {
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

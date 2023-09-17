package design.patterns.creational.builder;

public class CatMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Moçi");
        cat.setAge(2);
        cat.setBreed("Aziatike");
        cat.setWeight(1);

        Cat cat2 = Cat
                .builder()
                .name("Mozi")
                .age(3)
                .breed("C")
                .weight(15)
                .build();

    }
}

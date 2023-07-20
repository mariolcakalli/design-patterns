package design.patterns.structural.composite;

public class SimpleToy implements Toy {
    private final String name;

    public SimpleToy(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("Playing with " + name);
    }
}

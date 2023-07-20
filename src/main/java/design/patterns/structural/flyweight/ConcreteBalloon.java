package design.patterns.structural.flyweight;

public class ConcreteBalloon implements Balloon {
    private final String color;
    private final String size;
    private final String shape;

    public ConcreteBalloon(String color, String size, String shape) {
        this.color = color;
        this.size = size;
        this.shape = shape;
    }

    public void inflate() {
        System.out.println("Inflating a " + color + ", " + size + ", " + shape + " balloon.");
    }
}

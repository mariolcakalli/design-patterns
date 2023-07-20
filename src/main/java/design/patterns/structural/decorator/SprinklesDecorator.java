package design.patterns.structural.decorator;

public class SprinklesDecorator implements Cupcake {
    private final Cupcake cupcake;

    public SprinklesDecorator(Cupcake cupcake) {
        this.cupcake = cupcake;
    }

    public String decorate() {
        return cupcake.decorate() + " with sprinkles";
    }
}

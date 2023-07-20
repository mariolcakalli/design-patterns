package design.patterns.structural.decorator;

public class ChocolateFlavorDecorator implements Cupcake {
    private final Cupcake cupcake;

    public ChocolateFlavorDecorator(Cupcake cupcake) {
        this.cupcake = cupcake;
    }

    public String decorate() {
        return cupcake.decorate() + " with chocolate flavor";
    }
}

package design.patterns.structural.decorator;

public class DecoratorMain {
        public static void main(String[] args) {
            Cupcake basicCupcake = new BasicCupcake();
            System.out.println(basicCupcake.decorate()); // Output: Basic cupcake

            Cupcake chocolateCupcake = new ChocolateFlavorDecorator(basicCupcake);
            System.out.println(chocolateCupcake.decorate()); // Output: Basic cupcake with chocolate flavor

            Cupcake sprinklesCupcake = new SprinklesDecorator(chocolateCupcake);
            System.out.println(sprinklesCupcake.decorate()); // Output: Basic cupcake with chocolate flavor with sprinkles
        }
}

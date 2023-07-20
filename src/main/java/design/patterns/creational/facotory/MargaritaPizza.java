package design.patterns.creational.facotory;

public class MargaritaPizza implements Pizza {
    public void prepare() {
        System.out.println("Preparing margarita pizza...");
    }

    public void bake() {
        System.out.println("Baking margarita pizza...");
    }

    public void cut() {
        System.out.println("Cutting margarita pizza...");
    }

    public void box() {
        System.out.println("Boxing margarita pizza...");
    }
}

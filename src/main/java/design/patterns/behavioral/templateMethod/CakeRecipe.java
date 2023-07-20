package design.patterns.behavioral.templateMethod;

abstract class CakeRecipe {
    public void makeCake() {
        prepareIngredients();
        mixIngredients();
        pourIntoPan();
        bakeInOven();
        coolDown();
        decorateCake();
    }

    abstract void prepareIngredients();

    abstract void mixIngredients();

    void pourIntoPan() {
        System.out.println("Pouring the mixture into a baking pan.");
    }

    void bakeInOven() {
        System.out.println("Baking the cake in the oven for 30 minutes.");
    }

    void coolDown() {
        System.out.println("Letting the cake cool down.");
    }

    abstract void decorateCake();
}


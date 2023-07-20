package design.patterns.behavioral.templateMethod;

class ChocolateCake extends CakeRecipe {
    void prepareIngredients() {
        System.out.println("Gathering ingredients for a chocolate cake.");
    }

    void mixIngredients() {
        System.out.println("Mixing the chocolate cake ingredients.");
    }

    void decorateCake() {
        System.out.println("Decorating the chocolate cake with chocolate frosting.");
    }
}


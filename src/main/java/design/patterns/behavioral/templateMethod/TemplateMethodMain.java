package design.patterns.behavioral.templateMethod;

public class TemplateMethodMain {
    public static void main(String[] args) {
        CakeRecipe chocolateCake = new ChocolateCake();
        chocolateCake.makeCake();
    }
}

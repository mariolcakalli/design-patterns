package design.patterns.creational.facotory;

import java.util.Scanner;

public class MainFactory {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PizzaFactory pizzaFactory = new PizzaFactory();
        while (true) {
            System.out.print("Enter desired Pizza: ");
            String pizzaType = in.next();

            // Create a cheese pizza using the factory.
            Pizza pizza = pizzaFactory.createPizza(pizzaType);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();

            System.out.println();
        }
    }
}

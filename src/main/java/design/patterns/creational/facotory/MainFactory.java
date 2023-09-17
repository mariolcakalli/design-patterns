package design.patterns.creational.facotory;

import java.util.Scanner;

public class MainFactory {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Enter desired Pizza: ");
            String pizzaType = in.next();

            // Create a cheese pizza using the factory.
            Pizza pizza = PizzaFactory.createPizza(pizzaType);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();

            System.out.println();
        }
    }
}

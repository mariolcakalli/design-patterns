package design.patterns.creational.facotory;// Let's start by creating an interface for our pizza.

// Now, let's create a pizza factory class.
class PizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }else if (type.equals("margarita")) {
            pizza = new MargaritaPizza();
        }

        return pizza;
    }
}


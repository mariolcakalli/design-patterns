package design.patterns.creational.abstractFactory;

public class ToyMain{

// Finally, let's test our abstract factory implementation.
    public static void main(String[] args) {
        // Create a plastic toy factory.
        AbstractToyFactory abstractToyFactory = new AbstractToyFactory();

        Car plasticCar = abstractToyFactory.createCar("plastic");
        Doll plasticDoll = abstractToyFactory.createDoll("plastic");
        Robot plasticRobot = abstractToyFactory.createRobot("plastic");

        plasticCar.assemble();
        plasticCar.paint();

        plasticDoll.assemble();
        plasticDoll.dressUp();

        plasticRobot.assemble();
        plasticRobot.program();

        System.out.println();

        // Create a wooden toy factory.
        Car woodenCar = abstractToyFactory.createCar("wooden");
        Doll woodenDoll = abstractToyFactory.createDoll("wooden");
        Robot woodenRobot = abstractToyFactory.createRobot("wooden");

        woodenCar.assemble();
        woodenCar.paint();

        woodenDoll.assemble();
        woodenDoll.dressUp();

        woodenRobot.assemble();
        woodenRobot.program();
    }
}


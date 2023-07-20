package design.patterns.creational.abstractFactory;


class WoodenToyFactory implements ToyFactory {
    public Car createCar() {
        return new WoodenCar();
    }

    public Doll createDoll() {
        return new WoodenDoll();
    }

    public Robot createRobot() {
        return new WoodenRobot();
    }
}

package design.patterns.creational.abstractFactory;


class PlasticToyFactory implements ToyFactory {
    public Car createCar() {
        return new PlasticCar();
    }

    public Doll createDoll() {
        return new PlasticDoll();
    }

    public Robot createRobot() {
        return new PlasticRobot();
    }
}

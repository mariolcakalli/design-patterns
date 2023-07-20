package design.patterns.creational.abstractFactory;


interface ToyFactory {
    Car createCar();
    Doll createDoll();
    Robot createRobot();
}

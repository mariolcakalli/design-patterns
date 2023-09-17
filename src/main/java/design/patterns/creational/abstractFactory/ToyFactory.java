package design.patterns.creational.abstractFactory;


import design.patterns.structural.composite.Toy;

interface ToyFactory {
    Car createCar();
    Doll createDoll();
    Robot createRobot();
}

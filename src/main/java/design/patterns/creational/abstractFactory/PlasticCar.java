package design.patterns.creational.abstractFactory;

class PlasticCar implements Car {
    public void assemble() {
        System.out.println("Assembling plastic car...");
    }

    public void paint() {
        System.out.println("Painting plastic car...");
    }
}

package design.patterns.creational.abstractFactory;

class WoodenCar implements Car {
    public void assemble() {
        System.out.println("Assembling wooden car...");
    }

    public void paint() {
        System.out.println("Painting wooden car...");
    }
}

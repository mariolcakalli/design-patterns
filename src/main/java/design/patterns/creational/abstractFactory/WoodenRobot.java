package design.patterns.creational.abstractFactory;

class WoodenRobot implements Robot {
    public void assemble() {
        System.out.println("Assembling wooden robot...");
    }

    public void program() {
        System.out.println("Programming wooden robot...");
    }
}

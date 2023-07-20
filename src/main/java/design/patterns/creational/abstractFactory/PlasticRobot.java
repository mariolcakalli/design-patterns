package design.patterns.creational.abstractFactory;

class PlasticRobot implements Robot {
    public void assemble() {
        System.out.println("Assembling plastic robot...");
    }

    public void program() {
        System.out.println("Programming plastic robot...");
    }
}

package design.patterns.creational.abstractFactory;

class PlasticDoll implements Doll {
    public void assemble() {
        System.out.println("Assembling plastic doll...");
    }

    public void dressUp() {
        System.out.println("Dressing up plastic doll...");
    }
}

package design.patterns.creational.abstractFactory;

class WoodenDoll implements Doll {
    public void assemble() {
        System.out.println("Assembling wooden doll...");
    }

    public void dressUp() {
        System.out.println("Dressing up wooden doll...");
    }
}

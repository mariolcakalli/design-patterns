package design.patterns.behavioral.visitor;

public class VisitorMain {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal elephant = new Elephant();
        Animal monkey = new Monkey();

        Visitor zookeeper = new Visitor();

        lion.accept(zookeeper);
        elephant.accept(zookeeper);
        monkey.accept(zookeeper);
    }
}

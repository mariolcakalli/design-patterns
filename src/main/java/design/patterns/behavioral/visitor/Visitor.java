package design.patterns.behavioral.visitor;

public class Visitor {
    void visitLion(Lion lion) {
        System.out.println("Feeding the lion!");
    }

    void visitElephant(Elephant elephant) {
        System.out.println("Giving a bath to the elephant!");
    }

    void visitMonkey(Monkey monkey) {
        System.out.println("Playing with the monkey!");
    }
}

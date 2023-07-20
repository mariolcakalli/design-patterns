package design.patterns.behavioral.visitor;

class Elephant implements Animal {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitElephant(this);
    }
}

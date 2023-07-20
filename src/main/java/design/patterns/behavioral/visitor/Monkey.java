package design.patterns.behavioral.visitor;

class Monkey implements Animal {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitMonkey(this);
    }
}

package design.patterns.behavioral.visitor;

class Lion implements Animal {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitLion(this);
    }
}

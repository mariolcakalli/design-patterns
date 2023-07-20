package design.patterns.behavioral.visitor;

interface Animal {
    void accept(Visitor visitor);
}

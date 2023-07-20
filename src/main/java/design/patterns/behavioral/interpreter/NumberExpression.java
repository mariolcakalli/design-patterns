package design.patterns.behavioral.interpreter;

public class NumberExpression extends Expression {
    private final int value;

    public NumberExpression(int value) {
        this.value = value;
    }

    public int interpret() {
        return value;
    }
}

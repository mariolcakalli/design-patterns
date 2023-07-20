package design.patterns.behavioral.interpreter;

public class AdditionExpression extends Expression {
    private final Expression leftOperand;
    private final Expression rightOperand;

    public AdditionExpression(Expression leftOperand, Expression rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    public int interpret() {
        return leftOperand.interpret() + rightOperand.interpret();
    }
}

package design.patterns.behavioral.interpreter;

public class MultiplicationExpression extends Expression{
    private final Expression leftOperand;
    private final Expression rightOperand;

    public MultiplicationExpression(Expression leftOperand, Expression rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    @Override
    public int interpret() {
        return this.leftOperand.interpret() * this.rightOperand.interpret();
    }
}

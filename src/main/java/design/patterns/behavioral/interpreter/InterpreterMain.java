package design.patterns.behavioral.interpreter;

public class InterpreterMain {
    public static void main(String[] args) {
        // Create the expression tree: 3 * (5 + (2 - 1))
        Expression expression = new MultiplicationExpression(
                new NumberExpression(3),
                new AdditionExpression(
                        new NumberExpression(5),
                        new SubtractionExpression(
                                new NumberExpression(2),
                                new NumberExpression(1)
                        )
                )
        );

        // Evaluate the expression
        int result = expression.interpret();

        System.out.println("Result: " + result); // Output: Result: 6
    }
}

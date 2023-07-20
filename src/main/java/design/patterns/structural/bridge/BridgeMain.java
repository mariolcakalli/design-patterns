package design.patterns.structural.bridge;

public class BridgeMain {
    public static void main(String[] args) {
        DrawingDevice printer = new WhiteBoard();
        DrawingDevice screen = new Screen();

        Shape rectangleOnPrinter = new Rectangle(printer);
        rectangleOnPrinter.draw();

        Shape rectangleOnScreen = new Rectangle(screen);
        rectangleOnScreen.draw();

        Shape circleOnPrinter = new Circle(printer);
        circleOnPrinter.draw();

        Shape circleOnScreen = new Circle(screen);
        circleOnScreen.draw();

        Shape squareOnPrinter = new Square(printer);
        squareOnPrinter.draw();

        Shape squareOnScreen = new Square(screen);
        squareOnScreen.draw();

        DrawingDevice projector = new Projector();
        Shape rectangleOnProjector = new Rectangle(projector);
        rectangleOnProjector.draw();


    }
}

package design.patterns.structural.bridge;

public class BridgeMain {
    public static void main(String[] args) {
        DrawingDevice whiteBoard = new WhiteBoard();
        DrawingDevice screen = new Screen();

        Shape rectangleOnWhiteBoard = new Rectangle(whiteBoard);
        rectangleOnWhiteBoard.draw();

        Shape rectangleOnScreen = new Rectangle(screen);
        rectangleOnScreen.draw();

        Shape circleOnWhiteBoard = new Circle(whiteBoard);
        circleOnWhiteBoard.draw();

        Shape circleOnScreen = new Circle(screen);
        circleOnScreen.draw();

        Shape squareOnWhiteBoard = new Square(whiteBoard);
        squareOnWhiteBoard.draw();

        Shape squareOnScreen = new Square(screen);
        squareOnScreen.draw();

        DrawingDevice projector = new Projector();
        Shape rectangleOnProjector = new Rectangle(projector);
        rectangleOnProjector.draw();


    }
}

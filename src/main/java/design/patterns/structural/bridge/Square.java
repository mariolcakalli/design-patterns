package design.patterns.structural.bridge;

public class Square extends Shape {
    public Square(DrawingDevice drawingDevice) {
        super(drawingDevice);
    }

    public void draw() {
        System.out.println("Drawing a square...");
        drawingDevice.drawShape();
    }
}

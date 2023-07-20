package design.patterns.structural.bridge;

public class Rectangle extends Shape {
    public Rectangle(DrawingDevice drawingDevice) {
        super(drawingDevice);
    }

    public void draw() {
        System.out.println("Drawing a rectangle...");
        drawingDevice.drawShape();
    }
}

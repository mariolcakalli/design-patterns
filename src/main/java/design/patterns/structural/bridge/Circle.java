package design.patterns.structural.bridge;

public class Circle extends Shape {
    public Circle(DrawingDevice drawingDevice) {
        super(drawingDevice);
    }

    public void draw() {
        System.out.println("Drawing a circle...");
        drawingDevice.drawShape();
    }
}

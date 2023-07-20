package design.patterns.structural.bridge;

public abstract class Shape {
    protected DrawingDevice drawingDevice;

    public Shape(DrawingDevice drawingDevice) {
        this.drawingDevice = drawingDevice;
    }

    public abstract void draw();
}


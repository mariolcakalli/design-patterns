package design.patterns.structural.bridge;

public class Projector implements DrawingDevice {
    public void drawShape() {
        System.out.println("Drawing shape on the projector.");
    }
}

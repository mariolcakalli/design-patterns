package design.patterns.structural.bridge;

public class Screen implements DrawingDevice {
    public void drawShape() {
        System.out.println("Drawing shape on the screen.");
    }
}

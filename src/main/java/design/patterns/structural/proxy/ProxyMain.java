package design.patterns.structural.proxy;

public class ProxyMain {
    public static void main(String[] args) {
        Image image = new ImageProxy("image.jpg");
        image.display();

        // The image is already loaded, so no new loading operation is performed
        image.display();
    }
}

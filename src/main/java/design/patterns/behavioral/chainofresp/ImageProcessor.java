package design.patterns.behavioral.chainofresp;

public class ImageProcessor extends RequestProcessor {
    protected boolean canHandleRequest(Request request) {
        return request.getType().equals("image");
    }

    protected void handleRequest(Request request) {
        System.out.println("Processing image request.");
    }
}

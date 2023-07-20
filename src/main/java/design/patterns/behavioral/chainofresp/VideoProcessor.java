package design.patterns.behavioral.chainofresp;

public class VideoProcessor extends RequestProcessor {
    protected boolean canHandleRequest(Request request) {
        return request.getType().equals("video");
    }

    protected void handleRequest(Request request) {
        System.out.println("Processing video request.");
    }
}

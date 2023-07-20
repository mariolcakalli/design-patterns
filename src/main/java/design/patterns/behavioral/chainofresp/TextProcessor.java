package design.patterns.behavioral.chainofresp;

public class TextProcessor extends RequestProcessor {
    protected boolean canHandleRequest(Request request) {
        return request.getType().equals("text");
    }

    protected void handleRequest(Request request) {
        System.out.println("Processing text request.");
    }
}

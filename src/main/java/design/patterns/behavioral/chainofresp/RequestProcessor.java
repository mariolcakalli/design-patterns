package design.patterns.behavioral.chainofresp;

public abstract class RequestProcessor {
    private RequestProcessor nextProcessor;

    public void setNextProcessor(RequestProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public void processRequest(Request request) {
        if (canHandleRequest(request)) {
            handleRequest(request);
        } else if (nextProcessor != null) {
            nextProcessor.processRequest(request);
        } else {
            System.out.println("No processor found to handle the request.");
        }
    }

    protected abstract boolean canHandleRequest(Request request);

    protected abstract void handleRequest(Request request);
}

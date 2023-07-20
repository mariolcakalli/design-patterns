package design.patterns.behavioral.chainofresp;

public class ChainOfRespMain {
    public static void main(String[] args) {
        RequestProcessor textProcessor = new TextProcessor();
        RequestProcessor imageProcessor = new ImageProcessor();
        RequestProcessor videoProcessor = new VideoProcessor();

        textProcessor.setNextProcessor(imageProcessor);
        imageProcessor.setNextProcessor(videoProcessor);

        Request textRequest = new Request("text");
        Request imageRequest = new Request("image");
        Request videoRequest = new Request("video");

        textProcessor.processRequest(textRequest);
        textProcessor.processRequest(imageRequest);
        textProcessor.processRequest(videoRequest);
    }
}

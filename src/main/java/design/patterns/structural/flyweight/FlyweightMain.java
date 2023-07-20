package design.patterns.structural.flyweight;

public class FlyweightMain {
    public static void main(String[] args) {
        BalloonFactory balloonFactory = new BalloonFactory();

        Balloon redSmallRoundBalloon =
                balloonFactory.getBalloon("red", "small", "round");
        redSmallRoundBalloon.inflate();

        Balloon blueSmallRoundBalloon =
                balloonFactory.getBalloon("blue", "small", "round");
        blueSmallRoundBalloon.inflate();

        Balloon redSmallSquareBalloon =
                balloonFactory.getBalloon("red", "small", "square");
        redSmallSquareBalloon.inflate();

        // The factory reuses the existing red, small, round balloon
        Balloon redSmallRoundBalloon2 =
                balloonFactory.getBalloon("red", "small", "round");
        redSmallRoundBalloon2.inflate();
    }
}

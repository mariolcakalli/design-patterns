package design.patterns.structural.adapter;

public class SimpleRobotToy implements RobotToy {
    public void walk() {
        System.out.println("Robot toy is walking.");
    }

    public void turnLeft() {
        System.out.println("Robot toy is turning left.");
    }

    public void turnRight() {
        System.out.println("Robot toy is turning right.");
    }
}

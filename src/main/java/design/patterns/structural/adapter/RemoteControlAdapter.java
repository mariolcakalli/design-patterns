package design.patterns.structural.adapter;

public class RemoteControlAdapter implements RemoteControl {
    private final RobotToy robotToy;

    public RemoteControlAdapter(RobotToy robotToy) {
        this.robotToy = robotToy;
    }

    public void moveForward() {
        robotToy.walk();
    }

    public void rotateLeft() {
        robotToy.turnLeft();
    }

    public void rotateRight() {
        robotToy.turnRight();
    }
}

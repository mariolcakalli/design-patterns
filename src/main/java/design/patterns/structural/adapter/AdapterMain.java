package design.patterns.structural.adapter;

public class AdapterMain {
    public static void main(String[] args) {
        RobotToy robotToy = new SimpleRobotToy();
        RemoteControl remoteControl =
                new RemoteControlAdapter(robotToy);

        remoteControl.moveForward();
        remoteControl.rotateLeft();
        remoteControl.rotateRight();
    }
}

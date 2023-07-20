package design.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BalloonFactory {
    private final Map<String, Balloon> balloons;

    public BalloonFactory() {
        balloons = new HashMap<>();
    }

    public Balloon getBalloon(String color, String size, String shape) {
        String key = color + size + shape;

        if (balloons.containsKey(key)) {
            return balloons.get(key);
        } else {
            Balloon balloon = new ConcreteBalloon(color, size, shape);
            balloons.put(key, balloon);
            return balloon;
        }
    }
}

package design.patterns.behavioral.observer;

public class TemperatureDisplay implements Observer {
    private final String displayLocation;

    public TemperatureDisplay(String displayLocation) {
        this.displayLocation = displayLocation;
    }

    public void update(int temperature) {
        System.out.println(this.displayLocation + " Temperature Display: " + temperature + " degrees Celsius");
    }
}

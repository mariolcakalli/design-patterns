package design.patterns.behavioral.observer;

public class ObserverMain {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        TemperatureDisplay display1
                = new TemperatureDisplay("Kitchen");
        TemperatureDisplay display2
                = new TemperatureDisplay("Bedroom");

        weatherStation.registerObserver(display1);
        weatherStation.registerObserver(display2);

        weatherStation.setTemperature(25); // Notifies both displays
        weatherStation.setTemperature(30); // Notifies both displays
    }
}

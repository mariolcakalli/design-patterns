package design.patterns.structural.facade;

class CarFacade {
    private final Engine engine;
    private final FuelInjector fuelInjector;
    private final Ignition ignition;
    private final Battery battery;

    public CarFacade() {
        engine = new Engine();
        fuelInjector = new FuelInjector();
        ignition = new Ignition();
        battery = new Battery();
    }

    public void startCar() {
        System.out.println("Starting the car...");
        battery.supplyPower();
        fuelInjector.injectFuel();
        ignition.ignite();
        engine.start();
        System.out.println("Car started successfully!");
    }
}

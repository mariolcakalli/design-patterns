package design.patterns.structural.facade;

public class FacadeMain {
    public static void main(String[] args) {
        CarFacade carFacade = new CarFacade();
        carFacade.startCar();
    }
}

package design.patterns.creational.abstractFactory;

public class AbstractToyFactory {
    ToyFactory plasticToyFactory = new PlasticToyFactory();
    ToyFactory woodenToyFactory = new WoodenToyFactory();

    public Doll createDoll(String dollType){
        if("plastic".equals(dollType)){
            return plasticToyFactory.createDoll();
        }
        if("wooden".equals(dollType)){
            return woodenToyFactory.createDoll();
        }
        return null;
    }

    public Car createCar(String carType) {
        return null;
    }



    public Robot createRobot(String robotType) {
        return null;
    }
}

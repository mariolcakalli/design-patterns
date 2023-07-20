package design.patterns.structural.composite;

public class CompositeMain {
        public static void main(String[] args) {
            Toy car = new SimpleToy("Car");
            Toy doll = new SimpleToy("Doll");

            ToyCollection toyCollection = new ToyCollection();
            toyCollection.add(car);
            toyCollection.add(doll);

            Toy ball = new SimpleToy("Ball");

            ToyCollection finalCollection = new ToyCollection();
            finalCollection.add(toyCollection);
            finalCollection.add(ball);

            finalCollection.play();
        }

}

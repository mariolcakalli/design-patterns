package design.patterns.behavioral.iterator;

import java.util.List;
import java.util.Iterator;

public class ToyBox implements Iterable<Toy> {
    private final List<Toy> toys;

    public ToyBox(List<Toy> toys) {
        this.toys = toys;
    }

    public Iterator<Toy> iterator() {
        return new ToyIterator();
    }

    private class ToyIterator implements Iterator<Toy> {
        private int currentIndex;

        public boolean hasNext() {
            return currentIndex < toys.size();
        }

        public Toy next() {
            Toy toy = toys.get(currentIndex);
            currentIndex++;
            return toy;
        }
    }
}


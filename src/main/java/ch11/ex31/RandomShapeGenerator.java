package ch11.ex31;

import java.util.Iterator;
import java.util.Random;

public class RandomShapeGenerator implements Iterable<Shape> {

    private Random random = new Random();

    public Shape make() {
        switch (random.nextInt(3)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }

    private Shape[] shapes;

    public RandomShapeGenerator(int n) {
        shapes = new Shape[n];
        for (int i = 0; i < n; ++i) {
            shapes[i] = make();
        }
    }

    public Iterator<Shape> iterator() {
        return new Iterator<Shape>() {

            private int index = 0;

            public boolean hasNext() {
                return index < shapes.length;
            }

            public Shape next() {
                return shapes[index++];
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        RandomShapeGenerator rsg = new RandomShapeGenerator(10);
        for (Shape s : rsg) {
            s.draw();
        }
    }
}

package ch8.ex3;
import java.util.Random;

class Shape {
    void draw() {}
    void erase() {}
    void amend() {
        System.out.println("Shape amend");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("circle draw");
    }

    @Override
    void erase() {
        System.out.println("circle erase");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("square draw");
    }

    @Override
    void erase() {
        System.out.println("square erase");
    }

    @Override
    void amend() {
        System.out.println("square amend");
    }
}

class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("triangle draw");
    }

    @Override
    void erase() {
        System.out.println("triangle erase");
    }
}

public class RandomShapeGenerator {
    private Random rand = new Random(47);
    public Shape next() {
        switch (rand.nextInt(3)) {
            default:
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
        }
    }

    public static void main(String[] args) {
        RandomShapeGenerator rsg = new RandomShapeGenerator();
        Shape[] s = new Shape[9];
        for (int i = 0; i < s.length; ++i) {
            s[i] = rsg.next();
        }
        for (Shape shp : s) {
            shp.draw();
            shp.amend();
        }
    }
}

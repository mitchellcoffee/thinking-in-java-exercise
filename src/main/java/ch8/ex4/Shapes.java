package ch8.ex4;
import java.util.Random;

class Shape {
    void draw() {}
    void erase() {}
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

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("rectangle draw");
    }

    @Override
    void erase() {
        System.out.println("rectangle draw");
    }
}

class RandomShapeGenerator {
    private Random rand = new Random(1147);
    public Shape next() {
        switch (rand.nextInt(4)) {
            default:
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
            case 3:
                return new Rectangle();
        }
    }


}

public class Shapes {
    static RandomShapeGenerator rsg = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for (int i = 0; i < s.length; ++i) {
            s[i] = rsg.next();
        }
        for (Shape shp : s) {
            shp.draw();
        }
    }
}

package ch14.ex5;

import java.util.Arrays;
import java.util.List;

abstract class Shape {
    void draw() { System.out.println(this + ".draw()"); }
    abstract public String toString();
}

class Circle extends Shape {
    public String toString() { return "Circle"; }
}

class Square extends Shape {
    public String toString() { return "Square"; }
}

class Triangle extends Shape {
    public String toString() { return "Triangle"; }
}

class Rhomboid extends Shape {
    public String toString() { return "Rhomboid"; }
}

public class Shapes {

    public static void rotate(Shape s) {
        if (!(s instanceof Circle)) {
            System.out.println(s + " rotate");
        }
    }

    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle(), new Rhomboid());
        for (Shape shape : shapeList) {
            shape.draw();
        }

        for(Shape shape : shapeList)
            shape.draw();
        System.out.println();
        for(Shape shape : shapeList)
            rotate(shape);
    }
}

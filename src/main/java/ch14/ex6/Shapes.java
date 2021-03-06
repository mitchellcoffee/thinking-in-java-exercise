package ch14.ex6;

import java.util.Arrays;
import java.util.List;

abstract class Shape {
    void draw() { System.out.println(this + ".draw()"); }
    abstract public String toString();
}

class Circle extends Shape {
    boolean flag = false;
    public String toString() {
        return (flag ? "H" : "Unh") + "ighlighted " + "Circle";
    }
}

class Square extends Shape {
    boolean flag = false;
    public String toString() {
        return (flag ? "H" : "Unh") + "ighlighted " + "Square";
    }
}

class Triangle extends Shape {
    boolean flag = false;
    public String toString() {
        return (flag ? "H" : "Unh") + "ighlighted " + "Triangle";
    }
}


public class Shapes {

    public static void setFlag(Shape s) {
        if (s instanceof Triangle) {
            ((Triangle)s).flag = true;
        }
    }

    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(
                new Circle(), new Square(), new Triangle()
        );
        for(Shape shape : shapeList) {
            setFlag(shape);
            System.out.println(shape);
        }
    }

}

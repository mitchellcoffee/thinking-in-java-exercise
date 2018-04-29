package ch9.ex3;


abstract class A {
    public abstract void print();

    A() {
        print();
    }
}

class SubA extends A {

    int i = 1;

    @Override
    public void print() {
        System.out.println("SubA print()");
        System.out.println("i = " + i);
    }
}

public class Ex3 {

    public static void main(String[] args) {
        SubA subA = new SubA();
        subA.print();
    }
}

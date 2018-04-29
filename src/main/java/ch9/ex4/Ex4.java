package ch9.ex4;


abstract class A {

}

class SubA extends A {
    void method() {
        System.out.println("A method()");
    }
}

abstract class B {
    abstract void print();
}

class SubB extends B {

    void print() {
        System.out.println("B print()");
    }
}


public class Ex4 {

    public static void testMethod(A a) {
        ((SubA)a).method();
    }

    public static void testPrint(B b) {
        b.print();
    }

    public static void main(String[] args) {
        A a = new SubA();
        testMethod(a);
        B b = new SubB();
        testPrint(b);

    }

}

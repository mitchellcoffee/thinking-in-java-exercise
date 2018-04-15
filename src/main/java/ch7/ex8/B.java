package ch7.ex8;

class A {
    A(int i) {
        System.out.println("A init: " + i);
    }
}

public class B extends A {
    B() {
        super(1);
    }

    B(int i) {
        super(i);
    }

    public static void main(String[] args) {
        B b1 = new B();
        B b2 = new B(2);
    }
}

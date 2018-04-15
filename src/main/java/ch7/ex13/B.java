package ch7.ex13;

class A {
    void method(int i) {
        System.out.println(i);
    }

    void method(float f) {
        System.out.println(f);
    }

    void method(double d) {
        System.out.println(d);
    }
}

public class B extends A {

    @Override
    void method(double d) {
        super.method(d);
        System.out.println("B" + d);
    }

    public static void main(String[] args) {
        B b = new B();
        b.method(1);
        b.method(1.2f);
        b.method(1.2d);
    }
}

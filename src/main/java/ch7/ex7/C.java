package ch7.ex7;

class A {
    A(int i) {
        System.out.println("init A");
    }
}

class B {
    B(int i) {
        System.out.println("init B");
    }
}

public class C extends A {

    public C(int i) {
        super(i);
    }

    B b = new B(1);

    public static void main(String[] args) {
        C c = new C(1);
    }
}

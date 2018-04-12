package ch7.ex5;

class A {
    A() {
        System.out.println("init A");
    }
}

class B {
    B() {
        System.out.println("init B");
    }
}

public class C extends A {

    B b = new B();

    public static void main(String[] args) {
        C c = new C();
    }
}

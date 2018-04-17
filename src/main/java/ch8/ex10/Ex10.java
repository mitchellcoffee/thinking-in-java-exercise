package ch8.ex10;

class A {
    public void a() {
        System.out.println("A.a()");
        b();
    }

    public void b() {
        System.out.println("A.b()");
    }
}

class B extends A {
    @Override
    public void b() {
        System.out.println("B.b()");
    }
}

public class Ex10 {
    public static void main(String[] args) {
        A b = new B();
        b.a();
    }
}

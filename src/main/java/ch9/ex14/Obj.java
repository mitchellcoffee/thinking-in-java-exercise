package ch9.ex14;

class Rodent {
    void eat() {

    }
}

public class Obj extends Rodent implements ABC {
    public void abc() {

    }

    public void a1() {

    }

    public void a2() {

    }

    public void b1() {

    }

    public void b2() {

    }

    public void c1() {

    }

    public void c2() {

    }

    public void eat() {

    }

    public static void a1(A a) {
        a.a1();
    }

    public static void b2(B b) {
        b.b2();
    }

    public static void c1(C c) {
        c.c1();
    }

    public static void abc(ABC abc) {
        abc.abc();
    }

    public static void eat(Rodent r) {
        r.eat();
    }

    public static void main(String[] args) {
        Obj obj = new Obj();
        a1(obj);
        b2(obj);
        c1(obj);
        abc(obj);
        eat(obj);
    }
}

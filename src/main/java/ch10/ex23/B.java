package ch10.ex23;

public class B {

    public U[] us;

    public B(int size) {
        us = new U[size];
    }

    public void addU(U u, int index) {
        us[index] = u;
    }

    public void earseU(int i) {
        us[i] = null;
    }

    public void testUs() {
        for (U u : us) {
            u.u1();
            u.u2();
            u.u3();
        }
    }

    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        B b = new B(2);
        b.addU(a1.makeU(), 0);
        b.addU(a2.makeU(), 1);
        b.testUs();
        b.earseU(1);
        //b.testUs();
    }
}

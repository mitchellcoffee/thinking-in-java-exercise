package ch10.ex23;

public class A {

    public U makeU() {
        return new U() {
            public void u1() {
                System.out.println("a.u1");
            }

            public void u2() {
                System.out.println("a.u2");
            }

            public void u3() {
                System.out.println("a.u3");
            }
        };
    }
}

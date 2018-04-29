package ch10.ex5;

public class Outer {

    public Outer() {
        System.out.println("outer init");
    }

    class Inner {

        public Inner() {
            System.out.println("inner init");
        }

    }
}

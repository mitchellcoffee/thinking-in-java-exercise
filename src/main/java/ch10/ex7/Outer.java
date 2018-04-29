package ch10.ex7;

public class Outer {

    private String s;

    private void method() {
        System.out.println("method()");
    }

    class Inner {

        public void changeS() {
            s = "Inner.abc";
            method();
        }
    }


    public void nextMethod() {
        Inner inner = new Inner();
        inner.changeS();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.nextMethod();
        System.out.println(outer.s);
    }
}

package ch10.ex1;

public class Outer {

    private int outerField;

    private class Inner {
        private int innerField;
    }

    public Inner method() {
        return new Inner();
    }

    public static void main(String[] args) {
        Outer o = new Outer();
        Inner inner = o.method();
        int i = inner.innerField;
    }
}

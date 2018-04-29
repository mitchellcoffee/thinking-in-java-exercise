package ch10.ex8;

public class Outer {

    class Inner {
        private String innerString;

    }

    public void method() {
        Inner inner = new Inner();
        String s = inner.innerString;
    }
}

package ch10.ex3;

public class Outer {

    private String priString;

    public Outer(String priString) {
        this.priString = priString;
    }

    class Inner {

        Inner() {
            System.out.println("Inner()");
        }

        @Override
        public String toString() {
            return priString;
        }
    }

    Inner makeInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Outer outer = new Outer("123");
        Inner inner = outer.makeInner();
        System.out.println(inner);

    }
}

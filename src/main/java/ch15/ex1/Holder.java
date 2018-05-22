package ch15.ex1;

public class Holder<T> {

    private T a;

    public Holder(T a) {
        this.a = a;
    }

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Holder<Integer> h = new Holder<Integer>(1);
        Integer i = h.getA();
        System.out.println(i);
        h.setA(10);
        System.out.println(h.getA());
    }
}

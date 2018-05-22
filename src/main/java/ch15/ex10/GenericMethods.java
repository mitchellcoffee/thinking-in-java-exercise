package ch15.ex10;

public class GenericMethods {
    public <T, U> void f(T x, U y, Integer z) {
        System.out.println(x.getClass().getName() +
                " " + y.getClass().getName() +
                " " + z.getClass().getName());
    }
    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("", 1, 1);
        gm.f(1.0F, 'c', 1);
    }
}

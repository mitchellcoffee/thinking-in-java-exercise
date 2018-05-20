package ch14.ex8;


class A {}

class B extends A {}

class C extends B {}


public class Ex8 {

    public static void hierachy(Object o) {
        if (o.getClass().getSuperclass() != null) {
            System.out.println(o.getClass() + " is a subclass of " +
                    o.getClass().getSuperclass());
            try {
                hierachy(o.getClass().getSuperclass().newInstance());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        hierachy(new C());
    }
}

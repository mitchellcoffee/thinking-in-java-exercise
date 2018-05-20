package ch14.ex10;

public class Ex10 {

    public static void main(String[] args) {
        char[] c = new char[10];

        System.out.println(c.getClass());

        System.out.println("Superclass of char[] c: " +
                c.getClass().getSuperclass());
        System.out.println("char[] c instanceof Object: " +
                (c instanceof Object));

    }
}

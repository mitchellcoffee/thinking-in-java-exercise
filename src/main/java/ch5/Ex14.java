package ch5;

class Test14 {
    static String s1;
    static String s2;

    static {
        s2 = "s2";
        System.out.println("init s2");
    }

    public Test14() {
        s1 = "s1";
        System.out.println("init s1");
    }

    public static void test() {
        System.out.println(s1);
        System.out.println(s2);
    }
}

public class Ex14 {

    public static void main(String[] args) {
        new Test14().test();
    }
}

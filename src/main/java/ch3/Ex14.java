package ch3;

public class Ex14 {
    private static void compare(String p, String q) {
        System.out.println(p == q);
        System.out.println(p.equals(q));
        System.out.println(p != q);
    }

    public static void main(String[] args) {
        compare("one", "two");
    }
}

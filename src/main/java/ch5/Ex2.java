package ch5;

class Test2 {
    String str = "abc";
    String str2;

    public Test2() {
        this.str2 = "abc";
    }
}

public class Ex2 {

    public static void main(String[] args) {
        Test2 t = new Test2();
        System.out.println(t.str);
        System.out.println(t.str2);
    }
}

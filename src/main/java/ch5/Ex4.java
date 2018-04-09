package ch5;


class Test4 {
    public Test4() {
        System.out.println("Test4 constructed");
    }

    public Test4(String s) {
        System.out.println(s + ": Test4 constructed");
    }

}

public class Ex4 {

    public static void main(String[] args) {
        Test4 t = new Test4("123");
    }

}

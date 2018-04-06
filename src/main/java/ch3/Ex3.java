package ch3;

class Letter {
    float f;
}

public class Ex3 {

    static void foo(Letter l) {
        l.f = 0.03f;
    }

    public static void main(String[] args) {
        Letter x = new Letter();
        x.f = 0.02f;
        System.out.println(x.f);
        foo(x);
        System.out.println(x.f);
    }
}

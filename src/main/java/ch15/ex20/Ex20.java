package ch15.ex20;


interface A {
    void f();
    void g();
}

class AI implements A {

    public void f() {
        System.out.println("AI f()");
    }

    public void g() {
        System.out.println("AI g()");
    }

    public void h() {
        System.out.println("AI h()");
    }
}

class G {
    public static <T extends A> void j(T x) {
        x.f();
        x.g();
    }
}

public class Ex20 {

    public static void main(String[] args) {
        AI ai = new AI();
        G.j(ai);

    }
}

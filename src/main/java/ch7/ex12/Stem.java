package ch7.ex12;

class Component1 {
    public Component1() {
        System.out.println("c1 init");
    }

    void dispose() {
        System.out.println("c1 dispose");
    }
}

class Component2 {
    public Component2() {
        System.out.println("c2 init");
    }

    void dispose() {
        System.out.println("c2 dispose");
    }
}

class Component3 {
    public Component3() {
        System.out.println("c3 init");
    }

    void dispose() {
        System.out.println("c3 dispose");
    }
}

class Root {

    Component1 c1;
    Component2 c2;
    Component3 c3;

    public Root() {
        System.out.println("root init");
        c1 = new Component1();
        c2 = new Component2();
        c3 = new Component3();
    }

    void dispose() {
        c1.dispose();
        c2.dispose();
        c3.dispose();
        System.out.println("root dispose");
    }
}

public class Stem extends Root {

    Component1 s1;
    Component2 s2;
    Component3 s3;

    public Stem() {
        super();
        System.out.println("stem init");
        s1 = new Component1();
        s2 = new Component2();
        s3 = new Component3();
    }

    void dispose() {
        s3.dispose();
        s2.dispose();
        s1.dispose();
        super.dispose();
        System.out.println("stem dispose");
    }

    public static void main(String[] args) {
        Stem stem = new Stem();
        try {
            Component1 s1 = stem.s1;
        } finally {
            stem.dispose();
        }
    }
}


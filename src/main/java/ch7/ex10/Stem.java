package ch7.ex10;

class Component1 {
    public Component1(int i) {
        System.out.println("c1 init: " + i);
    }
}

class Component2 {
    public Component2(int i) {
        System.out.println("c2 init: " + i);
    }
}

class Component3 {
    public Component3(int i) {
        System.out.println("c3 init: " + i);
    }
}

class Root {

    Component1 c1;
    Component2 c2;
    Component3 c3;

    public Root(float f) {
        c1 = new Component1(1);
        c2 = new Component2(2);
        c3 = new Component3(3);
        System.out.println("root init");
    }
}

public class Stem extends Root {

    Component1 s1;
    Component2 s2;
    Component3 s3;

    public Stem(double d) {
        super(1.1f);
        s1 = new Component1(11);
        s2 = new Component2(22);
        s3 = new Component3(33);
        System.out.println("stem init");
    }

    public static void main(String[] args) {
        Stem stem = new Stem(222.222);
    }
}
package ch7.ex9;

class Component1 {
    public Component1() {
        System.out.println("c1 init");
    }
}

class Component2 {
    public Component2() {
        System.out.println("c2 init");
    }
}

class Component3 {
    public Component3() {
        System.out.println("c3 init");
    }
}

class Root {

    Component1 c1;
    Component2 c2;
    Component3 c3;

    public Root() {
        System.out.println("root init");
    }
}

public class Stem extends Root {

    Component1 s1;
    Component2 s2;
    Component3 s3;

    public Stem() {
        System.out.println("stem init");
    }

    public static void main(String[] args) {
        Stem stem = new Stem();
    }
}



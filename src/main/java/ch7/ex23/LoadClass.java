package ch7.ex23;

class A {

    static int j = printInit("A.j init");

    static int printInit(String s) {
        System.out.println(s);
        return 1;
    }

    A() {
        System.out.println("A() init");
    }

}

class B extends A {
    static int k = printInit("B.k init");
    B() {
        System.out.println("B() init");
    }
}

class C {

    static int n = printInitC("C.n init");
    static A a = new A();
    C() {
        System.out.println("C() init");
    }
    static int printInitC(String s) {
        System.out.println(s);
        return 1;
    }
}

class D {
    D() {
        System.out.println("D() construct");
    }
}


public class LoadClass extends B {
    static int i = printInit("LoadClass.i init");
    LoadClass() {
        System.out.println("LoadClass() init");
    }

    public static void main(String[] args) {
        System.out.println("hi");
        LoadClass lc = new LoadClass();
        System.out.println(C.a);
        D d = new D();
    }
}

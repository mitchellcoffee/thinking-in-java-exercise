package ch2;

public class Ex7 {

    public static void main(String[] args) {
        System.out.println("StaticTest.i = " + StaticTest.i);
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();
        System.out.println("st1 = " + st1.i);
        System.out.println("st2 = " + st2.i);
        Incrementable sf = new Incrementable();
        sf.increment();
        System.out.println("------------------");
        System.out.println("st1 = " + st1.i);
        System.out.println("st2 = " + st2.i);
        Incrementable.increment();
        System.out.println("------------------");
        System.out.println("st1 = " + st1.i);
        System.out.println("st2 = " + st2.i);
    }
}

class StaticTest {
    static int i = 47;
}

class Incrementable {
    static void increment() {
        StaticTest.i++;
    }
}
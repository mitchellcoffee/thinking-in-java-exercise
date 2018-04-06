package ch2;

public class Ex8 {
    public static void main(String[] args) {
        System.out.println("StaticTest.i = " + StaticTestEx8.i);
        StaticTestEx8 st1 = new StaticTestEx8();
        StaticTestEx8 st2 = new StaticTestEx8();
        System.out.println("st1 = " + st1.i);
        System.out.println("st2 = " + st2.i);
        IncrementableEx8 sf = new IncrementableEx8();
        sf.increment();
        System.out.println("------------------");
        System.out.println("st1 = " + st1.i);
        System.out.println("st2 = " + st2.i);
        IncrementableEx8.increment();
        System.out.println("------------------");
        System.out.println("st1 = " + st1.i);
        System.out.println("st2 = " + st2.i);
    }
}

class StaticTestEx8 {
    static int i = 47;
}

class IncrementableEx8 {
    static void increment() {
        StaticTest.i++;
    }
}


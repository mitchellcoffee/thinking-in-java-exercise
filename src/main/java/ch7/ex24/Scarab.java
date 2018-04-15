package ch7.ex24;

class Insect {
    private int i = 9;
    protected int j;
    Insect() {
        System.out.println(i + " " + j);
        j = 39;
    }

    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }
    private static int x1 = printInit("static Insect.x1 init");
}

class Beetle extends Insect {
    private int k = printInit("Beetle.k init");
    public Beetle() {
        System.out.println(k);
        System.out.println(j);
    }
    private static int x2 = printInit("static Beetle.x2 init");
}

public class Scarab extends Beetle {
    private int n = printInit("Scarab.n init");
    public Scarab() {
        System.out.println(n);
        System.out.println(j);
    }

    private static int x3 = printInit("static scarab.x3 init");

    public static void main(String[] args) {
        System.out.println("Scarab constructor");
        Scarab sc = new Scarab();
    }


}

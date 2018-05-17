package ch12.ex9;

class ExceptionA extends Exception {
    public ExceptionA(String message) {
        super(message);
    }
}

class ExceptionB extends Exception {
    public ExceptionB(String message) {
        super(message);
    }
}

class ExceptionC extends Exception {
    public ExceptionC(String message) {
        super(message);
    }
}

public class Ex9 {

    static void f(int x) throws ExceptionA, ExceptionB, ExceptionC {
        if (x < 0) throw new ExceptionA("x < 0");
        if (x == 0) throw new ExceptionB("x == 0");
        if (x > 0) throw new ExceptionC("x > 0");
    }

    public static void main(String[] args) {
        try {
            f(0);
            f(1);
            f(-1);
        } catch (Exception e) {
            System.out.println("Caught Exception");
            e.printStackTrace(System.out);
        }
    }

}

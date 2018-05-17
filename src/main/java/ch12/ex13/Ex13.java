package ch12.ex13;

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

public class Ex13 {

    static void f(int x) throws ExceptionA, ExceptionB, ExceptionC {
        if (x < 0) throw new ExceptionA("x < 0");
        if (x == 0) throw new ExceptionB("x == 0");
        if (x > 0) throw new ExceptionC("x > 0");
    }

    private static Integer[] x = new Integer[1];

    public static void main(String[] args) {
        try {
            f(x[0]);
            f(1);
            f(-1);
            f(0);
        } catch (ExceptionA e) {
            e.printStackTrace();
        } catch (ExceptionC exceptionC) {
            exceptionC.printStackTrace();
        } catch (ExceptionB exceptionB) {
            exceptionB.printStackTrace();
        } finally {
            System.out.println("finally");
        }
    }
}

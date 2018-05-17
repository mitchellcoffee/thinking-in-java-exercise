package ch12.ex11;

class GException extends Exception {
    GException(String s) {
        super(s);
    }
}

public class Ex11 {

    static void g() throws GException {
        throw new GException("from g()");
    }

    static void f() {
        try {
            g();
        } catch (GException ge) {
            //System.out.println("Caught GException in f try");
            //ge.printStackTrace(System.out);
            throw new RuntimeException(ge);
        }
    }

    public static void main(String[] args) {
        f();
    }
}

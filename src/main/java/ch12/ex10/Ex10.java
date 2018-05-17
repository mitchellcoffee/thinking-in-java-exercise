package ch12.ex10;

class GException extends Exception {
    public GException(String message) {
        super(message);
    }
}

class FException extends Exception {
    public FException(String message) {
        super(message);
    }
}

public class Ex10 {


    static void f() {
        try {
            try {
                g();
            } catch (GException ge) {
                System.out.println("Caught GException in f inner try");
                ge.printStackTrace(System.out);
                throw new FException("from f(), inner try");
            }
        } catch (FException fe) {
            System.out.println("Caught FException in f() outer try");
            fe.printStackTrace(System.out);
        }
    }

    static void g() throws GException {
        throw new GException("from g()");
    }

    public static void main(String[] args) {
        f();
    }



}

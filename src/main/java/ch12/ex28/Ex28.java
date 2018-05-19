package ch12.ex28;

class Exception28 extends RuntimeException {
    private String msg;

    Exception28(String msg) {
        super(msg);
        System.out.println("Exception28()");
        this.msg = msg;
    }

    protected void shows() {
        System.out.println("Message from Exception: " + msg);
    }
}

public class Ex28 {

    public static void f() throws Exception28 {
        System.out.println("f()");
        throw new Exception28("Ouch from f()");
    }

    public static void main(String[] args) {
        f();
    }

}

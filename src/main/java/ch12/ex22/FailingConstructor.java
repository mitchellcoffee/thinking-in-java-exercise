package ch12.ex22;

public class FailingConstructor {
    Integer[] ia = new Integer[2];
    String s;

    FailingConstructor(String s) throws Exception {
        ia[0] = 0;
        ia[1] = 1;
        ia[2] = 2;
        this.s = s;
    }

    public static void main(String[] args) {
        try {
            FailingConstructor fc = new FailingConstructor("hi");
        } catch (Exception e) {
            System.err.println("Caught Exception in main()");
            e.printStackTrace(System.err);
        } finally {
            
        }
    }
}

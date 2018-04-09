package ch5;

public class Ex10 {

    public static void main(String[] args) {
        class Test {
            protected void finalize() {
                System.out.println("finalize");
            }
        }

        new Test();
        System.gc();
    }
}

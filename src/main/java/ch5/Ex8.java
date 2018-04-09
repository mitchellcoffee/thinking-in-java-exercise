package ch5;

public class Ex8 {
    public static void main(String[] args) {
        class Test8 {
            public void test1() {
                test2();
                this.test2();
            }

            public void test2() {
                System.out.println("test2");
            }
        }

        Test8 t = new Test8();
        t.test1();
    }


}

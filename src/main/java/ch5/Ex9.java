package ch5;

public class Ex9 {

    public static void main(String[] args) {
        class Test {
            public Test() {
                System.out.println("init test");
            }

            public Test(String s) {
                this();
                System.out.println(s);
            }
        }

        Test t = new Test("123");
    }
}

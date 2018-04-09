package ch5;

public class Ex18 {
    public static void main(String[] args) {
        class Test {
            Test(String str) {
                System.out.println("init: " + str);
            }
        }

        Test[] tests = new Test[] {
                new Test("1"),
                new Test("2")
        };
    }

}

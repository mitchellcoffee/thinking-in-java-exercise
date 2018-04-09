package ch5;

public class Ex17 {

    public static void main(String[] args) {
        class Test {
            Test(String str) {
                System.out.println("init: " + str);
            }
        }

        Test[] tests = new Test[10];

    }

}

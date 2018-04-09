package ch5;

public class Ex15 {

    public static void main(String[] args) {

        class Test {
            String s;
            {
                System.out.println("init s");
                s = "s";
            }
        }

        Test t = new Test();
        System.out.println(t.s);
    }
}

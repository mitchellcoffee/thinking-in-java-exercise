package ch5;

public class Ex19 {

    public static void main(String[] args) {
        class Test {
            void print(String... strs) {
                for (int i = 0; i < strs.length; ++i) {
                    System.out.println(strs[i]);
                }
            }
        }

        Test t = new Test();
        t.print("123", "234", "345");
        t.print(new String[] {"1", "2", "3"});
    }

}

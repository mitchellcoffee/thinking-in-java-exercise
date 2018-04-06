package ch4;

public class Ex4 {

    public static void main(String[] args) {
        for (int i = 2; i < 100000; ++i) {
            boolean result = true;
            for (int j = 2; j < (i + 2) / 2; ++j) {
                if (i % j == 0) {
                    result = false;
                }
            }
            if (result) {
                System.out.println(i);
            }
        }
    }

}

package ch4;

import java.util.Random;

public class Ex2 {

    public static void main(String[] args) {
        Random rand1 = new Random();
        Random rand2 = new Random();
        for (int i = 0; i < 25; ++i) {
            int p = rand1.nextInt();
            int q = rand2.nextInt();
            if (p > q) System.out.println(p + " > " + q);
            else if (p < q) System.out.println(p + " < " + q);
            else System.out.println(p + " = " + q);
        }
    }
}

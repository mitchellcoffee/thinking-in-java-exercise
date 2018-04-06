package ch4;

import java.util.Random;

public class Ex3 {

    public static void main(String[] args) {
        Random rand1 = new Random();
        Random rand2 = new Random();
        while (true) {
            int p = rand1.nextInt();
            int q = rand2.nextInt();
            if (p > q) System.out.println(p + " > " + q);
            else if (p < q) System.out.println(p + " < " + q);
            else System.out.println(p + " = " + q);
        }
    }

}

package ch3;

import java.util.Random;

class CoinSimulator {
    boolean head;

    void simulate() {
        Random rand = new Random(10);
        head = rand.nextInt() % 2 == 0;
    }
}

public class Ex7 {

    public static void main(String[] args) {
        CoinSimulator cs = new CoinSimulator();
        cs.simulate();
        System.out.println(cs.head);
    }
}

package ch11.ex28;

import java.util.PriorityQueue;
import java.util.Random;

public class Ex28 {

    public static void main(String[] args) {
        Random rand = new Random();
        PriorityQueue<Double> pq = new PriorityQueue<Double>();
        for (int i = 0; i < 10; i++) {
            double d = rand.nextDouble();
            pq.offer(d);
        }
        while (pq.peek() != null) {
            System.out.println(pq.poll());
        }
    }
}

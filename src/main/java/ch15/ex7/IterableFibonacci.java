package ch15.ex7;

import java.util.Iterator;

public class IterableFibonacci implements Iterable<Integer> {

    private Fibonacci fibonacci = new Fibonacci();

    private int m;

    public IterableFibonacci(int m) {
        this.m = m;
    }

    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            public boolean hasNext() {
                return m > 0;
            }

            public Integer next() {
                m--;
                return fibonacci.next();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for (int i : new IterableFibonacci(18)) {
            System.out.println(i);
        }
    }
}

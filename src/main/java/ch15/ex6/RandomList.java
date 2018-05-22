package ch15.ex6;

import java.util.ArrayList;
import java.util.Random;

public class RandomList<T> {

    private ArrayList<T> storage = new ArrayList<T>();
    private Random rand = new Random();

    public void add(T item) {
        storage.add(item);
    }

    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomList<Integer> ri = new RandomList<Integer>();
        for (int i = 0; i < 10; ++i) {
            ri.add(i);
        }
        for (int i = 0; i < 10; ++i) {
            System.out.println(ri.select());
        }
    }
}

package ch11.ex14;

import java.util.LinkedList;
import java.util.ListIterator;

public class Ex14 {

    public static void addMiddle(LinkedList<Integer> l, Integer[] ia) {
        for (Integer i : ia) {
            ListIterator<Integer> it = l.listIterator((l.size() / 2));
            it.add(i);
            System.out.println(l);
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Integer[] ia = {0, 1, 2, 3, 4, 5, 6};
        addMiddle(list, ia);

    }
}

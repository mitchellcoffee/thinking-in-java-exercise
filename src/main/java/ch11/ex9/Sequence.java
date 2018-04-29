package ch11.ex9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sequence {

    private List items;

    public Sequence() {
        items = new ArrayList();
    }

    public void add(Object x) {
        items.add(x);
    }


    public Iterator selector() {
        return items.iterator();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence();
        for (int i = 0; i < 15; ++i) {
            sequence.add(i);
        }
        Iterator iter = sequence.selector();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
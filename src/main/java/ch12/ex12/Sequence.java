package ch12.ex12;

interface Selector {
    boolean end();

    Object current();

    void next();
}

public class Sequence {

    private Object[] items;

    private int next;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length) {
            items[next++] = x;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    private class SequenceSelector implements Selector {

        private int i = 0;

        public boolean end() {
            return i == items.length;
        }

        public Object current() {
            return items[i];
        }

        public void next() {
            if (i < items.length) {
                ++i;
            }
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 11; ++i) {
            sequence.add(i);
        }
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.println(selector.current());
            selector.next();
        }
    }
}

package ch10.ex22;

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

    public Selector reverseSelector() {
        return new Selector() {
            private int index = items.length - 1;
            public boolean end() {
                return index == -1;
            }

            public Object current() {
                return items[index];
            }

            public void next() {
                if (index >= 0) {
                    index--;
                }
            }
        };
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; ++i) {
            sequence.add(i);
        }
        Selector selector = sequence.reverseSelector();
        while (!selector.end()) {
            System.out.println(selector.current());
            selector.next();
        }


    }
}
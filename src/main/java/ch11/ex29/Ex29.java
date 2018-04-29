package ch11.ex29;

import java.util.PriorityQueue;

class Test {
    private int i;

    public Test(int i) {
        this.i = i;
    }
}

public class Ex29 {

    /**
     * Exception in thread "main" java.lang.ClassCastException: ch11.ex29.Test cannot be cast to java.lang.Comparable
     */
    public static void main(String[] args) {
        PriorityQueue<Test> pt = new PriorityQueue<Test>();
        pt.add(new Test(1));
        pt.add(new Test(2));
    }
}

package ch11.ex7;

import java.util.ArrayList;
import java.util.List;

class Tester {
    public static int counter = 0;

    private int id = counter++;

    @Override
    public String toString() {
        return "Tester{" +
                "id=" + id +
                '}';
    }
}

public class Ex7 {

    public static void main(String[] args) {
        Tester[] t = new Tester[10];
        for (int i = 0; i < t.length; ++i) {
            t[i] = new Tester();
        }
        List<Tester> lt = new ArrayList<Tester>();
        for (Tester x : t) {
            lt.add(x);
        }

        List<Tester> sub = lt.subList(2, 6);
        System.out.println("sub: " + sub);

        // runtime ConcurrentModificationException
        // lt.removeAll(sub);
        List<Tester> copy = new ArrayList<Tester>(lt);
        copy.removeAll(sub);
        System.out.println("copy: " + copy);
        lt = copy;
        System.out.println("lt: " + lt);
    }

}

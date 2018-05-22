package ch15.ex15;

import net.mindview.util.Tuple;
import net.mindview.util.TwoTuple;

public class TupleTest {

    static TwoTuple<String, Integer> f() {
        return Tuple.tuple("hi", 48);
    }

    static TwoTuple f2() {
        return Tuple.tuple("hi", 47);
    }

    static void print(TwoTuple<String, Integer> tt) {
        System.out.println(tt);
    }

    public static void main(String[] args) {
        System.out.println(f());
        System.out.println(f2());
        print(f());
        print(f2());
        TwoTuple<String, Integer> tt2 = f2();
    }

}

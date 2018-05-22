package ch15.ex16;

import ch15.ex3.SixTuple;
import net.mindview.util.Tuple;

public class SixTupleDemo extends Tuple {

    public static <A, B, C, D, E, F> SixTuple<A, B, C, D, E, F> tuple(A a, B b, C c, D d, E e, F f) {
        return new SixTuple<A, B, C, D, E, F>(a, b, c, d, e, f);
    }
}

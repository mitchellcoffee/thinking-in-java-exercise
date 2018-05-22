package ch15.ex17;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static <T extends Enum<T>> Set<T> union(Set<T> a, Set<T> b) {
        try {
            if (a instanceof EnumSet) {
                Set<T> result = ((EnumSet<T>)a).clone();
                result.addAll(b);
                return result;
            }
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
        Set<T> result = new HashSet<T>(a);
        result.addAll(b);
        return result;
    }
}

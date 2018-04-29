package ch11.ex11;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Ex11 {

    public static void toCollectionString(Collection collection) {
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("a", "ab", "abc", "abcd");
        toCollectionString(stringList);
    }

}

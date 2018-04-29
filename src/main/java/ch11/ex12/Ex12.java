package ch11.ex12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Ex12 {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(0, 1, 2, 3, 4);
        List<Integer> reverseList = new ArrayList<Integer>(integerList.size());
        ListIterator<Integer> li = integerList.listIterator(integerList.size());
        while (li.hasPrevious()) {
            reverseList.add(li.previous());
        }
        System.out.println(reverseList);
    }
}

package ch11.ex5;

import java.util.*;


public class ListFeatures {

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7));
        System.out.println("1: " + ints);
        Integer p = 8;
        ints.add(8);
        System.out.println("2: " + ints);
        System.out.println("3: " + ints.contains(p));
        Integer i = ints.get(2);
        System.out.println("4: " + i + " " + ints.indexOf(i));
        Integer i2 = 9;
        System.out.println("5: " + ints.indexOf(i2));
        System.out.println("6: " + ints.remove(i2));
        System.out.println("7: " + ints.remove(p));
        System.out.println("8: " + ints);

        ints.add(3, Integer.valueOf(3));
        System.out.println("9: " + ints);
        List<Integer> subInts = ints.subList(1, 4);
        System.out.println("subList: " + subInts);
        System.out.println("10: " + ints.containsAll(subInts));

        Collections.sort(subInts);
        System.out.println("sorted subList: " + subInts);
        System.out.println("11: " + ints.containsAll(subInts));
        Collections.shuffle(subInts);
        System.out.println("shuffled subList: " + subInts);
        System.out.println("12: " + ints.containsAll(subInts));

        List<Integer> copy = new ArrayList<Integer>(ints);
        System.out.println("copy: " + copy);
        subInts = Arrays.asList(copy.get(1), copy.get(4));
        System.out.println("sub: " + subInts);
        copy.retainAll(subInts);
        System.out.println("13: " + copy);

        copy = new ArrayList<Integer>(ints);
        copy.remove(3);
        System.out.println("14: " + copy);
        copy.removeAll(subInts);
        System.out.println("15: " + copy);
        copy.set(1, 2);
        System.out.println("16: " + copy);
        copy.addAll(2, subInts);
        System.out.println("17: " + copy);

        System.out.println("18: " + ints.isEmpty());
        ints.clear();
        System.out.println("19: " + ints);
        System.out.println("20: " + ints.isEmpty());

        ints.addAll(Arrays.asList(1, 3, 5, 7));
        System.out.println("21: " + ints);
        Object[] o = ints.toArray();
        System.out.println("22: " + o[1]);
        Integer[] is = ints.toArray(new Integer[0]);
        System.out.println("23: " + is[1]);

    }
}

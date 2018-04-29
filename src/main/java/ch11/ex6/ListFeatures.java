package ch11.ex6;

import java.util.*;

public class ListFeatures {

    public static void main(String[] args) {
        List<String> strs = new ArrayList<String>(Arrays.asList("0", "1", "2", "3", "4", "5", "6"));
        System.out.println("1: " + strs);
        String s = "7";
        strs.add(s);
        System.out.println("2: " + strs);
        System.out.println("3: " + strs.contains(s));
        strs.remove(s);
        String str = strs.get(2);
        System.out.println("4: " + str + " " + strs.indexOf(str));

        String st = "7";
        System.out.println("5: " + strs.indexOf(st));
        System.out.println("6：" + strs.remove(st));

        System.out.println("7: " + strs.remove(s));
        System.out.println("8: " + strs);

        strs.add(3, "3");
        System.out.println("9: " + strs);
        List<String> sub = strs.subList(1, 3);
        System.out.println("subList: " + sub);
        System.out.println("10: " + strs.containsAll(sub));

        Collections.sort(sub);
        System.out.println("sorted sub: " + sub);
        System.out.println("11: " + strs.containsAll(sub));
        Collections.shuffle(sub);
        System.out.println("shuffled sub: " + sub);
        System.out.println("12: " + strs.containsAll(sub));

        List<String> copy = new ArrayList<String>(strs);
        sub = Arrays.asList(copy.get(1), copy.get(6));
        System.out.println("sub: " + sub);
        copy.retainAll(sub);
        System.out.println("13: " + copy);

        copy = new ArrayList<String>(strs);
        copy.remove(3);
        System.out.println("14: " + copy);
        copy.removeAll(sub);
        System.out.println("15: " + copy);
        copy.set(1, "1.1");
        System.out.println("16: " + copy);
        copy.addAll(2, sub);
        System.out.println("17: " + copy);

        System.out.println("18: " + strs.isEmpty());
        strs.clear();
        System.out.println("19: " + strs);
        System.out.println("20: " + strs.isEmpty());
        strs.addAll(Arrays.asList("1", "3", "5", "7"));
        System.out.println("21: " + strs);
        Object[] o = strs.toArray();
        System.out.println("22: " + o[1]);
        String[] ss = strs.toArray(new String[0]);
        System.out.println("23: " + o[2]);

    }

}

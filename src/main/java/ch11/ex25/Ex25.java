package ch11.ex25;

import java.util.*;

public class Ex25 {

    public static void main(String[] args) {
        Map<String, ArrayList<Integer> > m =
                new LinkedHashMap<String, ArrayList<Integer>>();
        List<String> words = new LinkedList<String>();
        words.addAll(Arrays.asList("abc", "cde", "123", "a123b", "123", "cde", "123"));
        Iterator<String> iterator = words.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            String s = iterator.next();
            ArrayList<Integer> list = m.get(s);
            list = list != null ? list : new ArrayList<Integer>();
            list.add(count);
            count ++;
            m.put(s, list);
        }
        System.out.println(m);
    }
}

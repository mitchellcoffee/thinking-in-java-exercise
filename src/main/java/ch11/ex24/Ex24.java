package ch11.ex24;

import java.util.*;

public class Ex24 {

    public static void main(String[] args) {
        Map<String, Integer> m = new LinkedHashMap<String, Integer>();
        m.put("ten", 10);
        m.put("nine", 9);
        m.put("eight", 8);
        m.put("seven", 7);
        m.put("six", 6);
		m.put("five", 5);
		m.put("four", 4);
		m.put("three", 3);
		m.put("two", 2);
		m.put("one", 1);
		m.put("zero", 0);
        System.out.println("Map to Sort: " + m);

        Map<String, Integer> mTemp = new LinkedHashMap<String, Integer>();
        Set<String> ss = new TreeSet<String>(m.keySet());
        Iterator<String> itss = ss.iterator();
        while (itss.hasNext()) {
            String s = itss.next();
            Integer i = m.get(s);
            m.remove(s);
            mTemp.put(s, i);
        }
        System.out.println(mTemp);

        Set<String> ssTemp = new TreeSet<String>(mTemp.keySet());
        Iterator<String> itssTemp = ssTemp.iterator();
        while (itssTemp.hasNext()) {
            String s = itssTemp.next();
            Integer i = mTemp.get(s);
            mTemp.remove(s);
            m.put(s, i);
        }

        mTemp.clear();
        System.out.println("Sorted map: " + m);
    }
}

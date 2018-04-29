package ch11.ex23;

import java.util.*;

public class Statistics {

    private static int getBestInt(int n) {
        Random random = new Random();
        Map<Integer, Integer> m = new TreeMap<Integer, Integer>();
        for (int i = 0; i < n; ++i) {
            int r = random.nextInt(20);
            Integer freq = m.get(r);
            m.put(r, freq == null ? 1 : freq + 1);
        }
        int max = 0;
        for (int i = 0; i < m.keySet().size(); i++) {
            max = max < m.get(i) ? m.get(i) : max;
        }
        Set<Map.Entry<Integer, Integer>> me = new LinkedHashSet<Map.Entry<Integer, Integer>>(m.entrySet());
        int maxKey = 0;
        Iterator<Map.Entry<Integer, Integer>> it = me.iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Integer> findMax = it.next();
            if (findMax.getValue() == max) {
                maxKey = findMax.getKey();
            }
        }
        return maxKey;
    }


    public static void main(String[] args) {
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for (int i = 0; i < 2000; i++) {
            int x = getBestInt(10000);
            Integer freq = map.get(x);
            map.put(x, freq == null ? 1 : freq + 1);
        }
        System.out.println("Most often picked ints, 0 - 19, in 2000 tests of 10000 random picks: " + map);
    }
}

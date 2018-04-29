package ch11.ex26;

import java.util.*;

public class Ex26 {

    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> map = new LinkedHashMap<String, ArrayList<Integer>>();
        map.put("abc", new ArrayList<Integer>(Arrays.asList(0)));
        map.put("cde", new ArrayList<Integer>(Arrays.asList(1, 5)));
        map.put("123", new ArrayList<Integer>(Arrays.asList(2, 4, 6)));
        map.put("a123b", new ArrayList<Integer>(Arrays.asList(3)));

        Set<Map.Entry<String, ArrayList<Integer>>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, ArrayList<Integer>>> iterator = entrySet.iterator();
        Map<Integer, String> replay = new TreeMap<Integer, String>();
        while (iterator.hasNext()) {
            Map.Entry<String, ArrayList<Integer>> me = iterator.next();
            for (int i = 0; i < me.getValue().size(); ++i) {
                replay.put(me.getValue().get(i), me.getKey());
            }
        }
        System.out.println(replay);
        System.out.println(replay.values());

    }
}

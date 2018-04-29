package ch11.ex21;

import java.util.*;

public class UniqueWords {

    public static void main(String[] args) {
        List<String> words = new ArrayList<String>(Arrays.asList("abc", "cde", "ojf", "Abc", "DC", "Dce", "Abc", "cde", "cde"));
        System.out.println(words);
        System.out.println();

        Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
        Map<String, Integer> wordCount = new LinkedHashMap<String, Integer>();
        Iterator<String> it = words.iterator();
        int totalWords = 0 ;
        while (it.hasNext()) {
            String s = it.next();
            if (words.contains(s)) {
                Integer count = wordCount.get(s);
                wordCount.put(s, count == null ? 1 : count + 1);
                totalWords++;
            }

        }
        System.out.println(wordCount);
        System.out.println(totalWords);
    }
}

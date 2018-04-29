package ch11.ex20;

import java.util.*;

public class Ex20 {

    static void vowelCounter(Set<String> st) {
        Set<Character> vowels = new TreeSet<Character>();
        Collections.addAll(vowels, 'a', 'e', 'i', 'o', 'u');
        Map<Character, Integer> vowelMap = new HashMap<Character, Integer>();
        for (String s : st) {
            int count = 0;
            for (Character v : s.toCharArray()) {
                if (vowels.contains(v)) {
                    count++;
                    vowelMap.put(v, vowelMap.get(v) == null ? 1 : vowelMap.get(v) + 1);
                }
            }
            System.out.println(s + ": " + count + ", ");
        }
        System.out.println();
        System.out.println("TotalVowels: " + vowelMap);

    }

    public static void main(String[] args) {
        String[] strs = {"abc", "cde", "d", "eaacdfu"};
        Set<String> words = new TreeSet<String>();
        Collections.addAll(words, strs);
        vowelCounter(words);
    }
}

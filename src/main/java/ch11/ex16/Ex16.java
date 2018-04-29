package ch11.ex16;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Ex16 {

    static void vowelCounter(Set<String> st) {
        Set<Character> vowels = new TreeSet<Character>();
        Collections.addAll(vowels, 'a', 'e', 'i', 'o', 'u');
        int allVowels = 0;
        for (String s : st) {
            int count = 0;
            for (Character v : s.toCharArray()) {
                if (vowels.contains(v)) {
                    count++;
                    allVowels++;
                }
            }
            System.out.println(s + ": " + count + ", ");
        }
        System.out.println();
        System.out.println("TotalVowels: " + allVowels);

    }

    public static void main(String[] args) {
        String[] strs = {"abc", "cde", "d", "eaacdfu"};
        Set<String> words = new TreeSet<String>();
        Collections.addAll(words, strs);
        vowelCounter(words);
    }
}

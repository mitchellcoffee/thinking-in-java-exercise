package ch11.ex22;

import java.util.*;

class Word {
    static int totalWords = 0;

    String s;
    int count;

    public Word(String s, int count) {
        this.s = s;
        this.count = count;
        totalWords++;
    }

    @Override
    public boolean equals(Object obj) {
        Word word = (Word)obj;
        return s.equals(word.s) && count == word.count;
    }

    @Override
    public int hashCode() {
        return this.count * 41 + s.hashCode();
    }

    @Override
    public String toString() {
        return s + ": " + count;
    }
}

public class UniqueWords {
    public static void main(String[] args) {
        List<String> words = new ArrayList<String>(Arrays.asList("abc", "cde", "ojf", "Abc", "DC", "Dce", "Abc", "cde", "cde"));
        System.out.println(words);
        System.out.println();
        Collections.sort(words, String.CASE_INSENSITIVE_ORDER);

        Set<Word> wordSet = new HashSet<Word>();
        Iterator<String> it = words.iterator();
        while (it.hasNext()) {
            String s = it.next();
            int count = 0;
            for (int i = 0; i < words.size(); i++) {
                if (s.equals(words.get(i))) {
                    count++;
                }
            }
            Word w = new Word(s, count);
            wordSet.add(w);
        }
        System.out.println(wordSet);
        System.out.println(Word.totalWords);


    }
}

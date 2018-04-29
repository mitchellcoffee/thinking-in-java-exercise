package ch11.ex15;

import java.util.*;

public class Ex15 {
    public static void main(String[] args) {
        Stack<Character> sc = new Stack<Character>();
        String arg = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s---";
        char[] chars = arg.toCharArray();
        List<Character> argList = new ArrayList<Character>();
        for (char c : chars) {
            argList.add(c);
        }
        Iterator<Character> iterator = argList.iterator();
        while (iterator.hasNext()) {
            char c = iterator.next();
            if (c == '+') {
                sc.push(iterator.next());
            } else if (c == '-') {
                sc.pop();
            }
            System.out.println(sc);
        }
    }
}

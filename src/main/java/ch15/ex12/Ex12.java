package ch15.ex12;

import ch15.ex11.New;

import java.util.Map;

public class Ex12 {


    static void f(Map<String, Integer> map) {

    }

    public static void main(String[] args) {
        f(New.<String, Integer>map());
    }

}

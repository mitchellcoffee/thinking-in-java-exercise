package ch15.ex13;

import net.mindview.util.Generator;

import java.util.*;


public class Generators {

    public static <T> Collection<T> fill(Collection<T> col, Generator<T> gen, int n) {
        for (int i = 0; i < n; ++i) {
            col.add(gen.next());
        }
        return col;
    }

    public static <T> List<T> fill(List<T> l, Generator<T> gen, int n) {
        for (int i = 0; i < n; ++i) {
            l.add(gen.next());
        }
        return l;
    }

    public static <T> Queue<T> fill(Queue<T> q, Generator<T> gen, int n) {
        for(int i = 0; i < n; i++) q.add(gen.next());
        return q;
    }
    public static <T> Set<T> fill(Set<T> s, Generator<T> gen, int n) {
        for(int i = 0; i < n; i++) s.add(gen.next());
        return s;
    }
    // return type LinkedList:
    public static <T> LinkedList<T> fill(LinkedList<T> ll, Generator<T> gen, int n) {
        for(int i = 0; i < n; i++) ll.add(gen.next());
        return ll;
    }

    public static void main(String[] args) {

    }
}

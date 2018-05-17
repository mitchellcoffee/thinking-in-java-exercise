package ch12.ex15;

import ch12.ex14.OnOffException1;
import ch12.ex14.OnOffException2;
import ch12.ex14.Switch;

public class Ex15 {

    private static Switch sw = new Switch();

    public static void f() throws OnOffException1, OnOffException2 {}

    public static void main(String[] args) {
        try {
            String s = null;
            int size = s.length();
            sw.on();
            f();
            sw.off();
        } catch (OnOffException2 onOffException2) {
            System.out.println("OnOffException2");
        } catch (OnOffException1 onOffException1) {
            System.out.println("OnOffException1");
        } finally {
            sw.off();
        }
    }
}

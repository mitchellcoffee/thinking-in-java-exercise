package ch7.ex15;

import ch7.ex15.protect.ProtectedClass;

public class ProtectedTest {

    public static void main(String[] args) {
        ProtectedClass pc = new ProtectedClass();
        // compile error
        // pc.method();
    }
}

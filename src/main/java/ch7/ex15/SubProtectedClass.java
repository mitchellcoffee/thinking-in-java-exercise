package ch7.ex15;

import ch7.ex15.protect.ProtectedClass;

public class SubProtectedClass extends ProtectedClass {

    public static void main(String[] args) {
        SubProtectedClass sub = new SubProtectedClass();
        sub.method();
    }
}

package ch10.ex6.b;

import ch10.ex6.a.Ex6Interface;

public class ClassB {

    protected class InnerB implements Ex6Interface {

        public InnerB() {
            System.out.println("InnerB init");
        }

        public void method() {
            System.out.println("Class B inner method()");
        }

    }
}

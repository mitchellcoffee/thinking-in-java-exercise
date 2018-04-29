package ch10.ex6.c;

import ch10.ex6.a.Ex6Interface;
import ch10.ex6.b.ClassB;

public class ClassC extends ClassB {

    Ex6Interface getInner() {
        return this.new InnerB();
    }

    public static void main(String[] args) {
        ClassC classC = new ClassC();
        Ex6Interface ex6Interface = classC.getInner();
        ex6Interface.method();
    }
}

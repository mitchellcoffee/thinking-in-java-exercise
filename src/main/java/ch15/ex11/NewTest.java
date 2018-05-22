package ch15.ex11;

import java.util.*;

import static net.mindview.util.Print.print;

class A { public String toString() { return "A"; } }

class B { public String toString() { return "B"; } }

class C extends B {
    public String toString() { return "C"; }
}


public class NewTest {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        List<C> lc = New.list();
        lc.add(new C());
        Map<A,List<? extends B>> mab = New.map();
        mab.put(a,lc);
        LinkedList<B> llb = New.lList();
        llb.add(new B());
        Set<A> sa = New.set();
        sa.add(new A());
        Queue<B> qb = New.queue();
        qb.add(new B());
        print(lc);
        print(mab);
        print(llb);
        print(sa);
        print(qb);
    }
}

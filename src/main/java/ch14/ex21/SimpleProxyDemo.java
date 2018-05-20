package ch14.ex21;

import java.util.Date;

import static net.mindview.util.Print.print;

interface Interface {
    void doSomething();

    void somethingElse(String arg);
}

class RealObject implements Interface {

    public void doSomething() {
        System.out.println("doSomething");
    }

    public void somethingElse(String arg) {
        System.out.println("somethingElse " + arg);
    }
}

class SimpleProxy implements Interface {

    private Interface proxied;

    private static int doCount = 0;
    private static int sECount = 0;

    public SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }

    public void doSomething() {
        long timeIn = new Date().getTime();
        print("Time called doSomething() " + doCount + ": " + timeIn + " msecs");
        print("on " + new Date());
        doCount++;
        proxied.doSomething();
        print("Call-return time = " + ((new Date().getTime()) - timeIn) + " msecs");
    }

    public void somethingElse(String arg) {
        long timeIn = new Date().getTime();
        print("Time called somethingElse() " + sECount + ": " + timeIn + " msecs");
        print("on " + new Date());
        sECount++;
        proxied.somethingElse(arg);
        print("Call-return time = " + ((new Date().getTime()) - timeIn) + " msecs");
    }
}

public class SimpleProxyDemo {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }
    public static void main(String[] args) {
        consumer(new RealObject());
        print();
        consumer(new SimpleProxy(new RealObject()));
        print();
        consumer(new SimpleProxy(new RealObject()));
        print();
        consumer(new SimpleProxy(new RealObject()));
    }
}

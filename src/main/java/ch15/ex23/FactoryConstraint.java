package ch15.ex23;



interface FactoryI<T> {
    T create();

    T create(Integer i);
}

class Foo2<T> {
    private T x;
    public <F extends FactoryI<T>> Foo2(F factory) {
        x = factory.create();
    }

    public <F extends FactoryI<T>> Foo2(F factory, Integer i) {
        x = factory.create(i);
    }

    public void get() {
        System.out.println(x);
    }
}

class IntegerFactory implements FactoryI<Integer> {
    public Integer create() {
        return new Integer(0);
    }

    public Integer create(Integer i) {
        return i;
    }


}

class Widget {

    private Integer i;

    public Widget(Integer i) {
        this.i = i;
    }

    public static class Factory implements FactoryI<Widget> {
        public Widget create() {
            return new Widget(0);
        }

        public Widget create(Integer i) {
            return new Widget(i);
        }
    }

    @Override
    public String toString() {
        return "Widget{" +
                "i=" + i +
                '}';
    }
}


public class FactoryConstraint {
    public static void main(String[] args) {
        Foo2 f1 = new Foo2<Integer>(new IntegerFactory());
        Foo2 f2 = new Foo2<Widget>(new Widget.Factory());
        f1.get();
        f2.get();
        Foo2 f3 = new Foo2<Integer>(new IntegerFactory(), 1);
        Foo2 f4 = new Foo2<Widget>(new Widget.Factory(), 2);
        f3.get();
        f4.get();
    }

}

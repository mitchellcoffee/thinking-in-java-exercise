package ch14.ex19;

import java.lang.reflect.InvocationTargetException;

import static net.mindview.util.Print.print;

interface HasBatteries {}
interface Waterproof {}
interface Shoots {}

class Toy {
    Toy() {
        print("Creating Toy() object");
    }
    Toy(int i) {
        print("Creating Toy(" + i + ") object");
    }
}

class FancyToy extends Toy
        implements HasBatteries, Waterproof, Shoots {
    FancyToy() { super(1); }
}

public class ToyTest19 {
    public static void main(String[] args) {
        // get appropriate constructor and create new instance:
        try {
            Toy.class.getDeclaredConstructor(int.class).newInstance(1);
            // catch four exceptions:
        } catch(NoSuchMethodException e) {
            print("No such method: " + e);
        } catch(InstantiationException e) {
            print("Unable make Toy: " + e);
        } catch(IllegalAccessException e) {
            print("Unable access: " + e);
        } catch(InvocationTargetException e) {
            print("Target invocation problem: " + e);
        }
    }
}

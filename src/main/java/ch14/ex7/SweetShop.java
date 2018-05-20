package ch14.ex7;

import static net.mindview.util.Print.print;

class Candy {
    static { print("Loading Candy"); }
}

class Gum {
    static { print("Loading Gum"); }
}

class Cookie {
    static { print("Loading Cookie"); }
}

public class SweetShop {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: sweetName");
            System.exit(0);
        }
        Class c = null;
        try {
            c = Class.forName(args[0]);
            print("Enjoy your " + args[0]);
        } catch(ClassNotFoundException e) {
            print("Couldn't find " + args[0]);
        }
    }

}

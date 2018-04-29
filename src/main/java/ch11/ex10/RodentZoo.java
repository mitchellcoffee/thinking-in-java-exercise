package ch11.ex10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class Rodent {
    public void eat() {
        System.out.println("Rodent eat");
    }
}

class Mouse extends Rodent {
    @Override
    public void eat() {
        System.out.println("Mouse eat");
    }
}

class Gerbil extends Rodent {
    @Override
    public void eat() {
        System.out.println("Gerbil eat");
    }
}

class Hamster extends Rodent {
    @Override
    public void eat() {
        System.out.println("Hamster eat");
    }
}

public class RodentZoo {
    public static void main(String[] args) {
        Rodent[] rodents = {
                new Mouse(),
                new Gerbil(),
                new Hamster()
        };
        List<Rodent> rodentList = Arrays.asList(rodents);
        Iterator<Rodent> iterator = rodentList.iterator();
        while (iterator.hasNext()) {
            Rodent rodent = iterator.next();
            rodent.eat();
        }

    }
}

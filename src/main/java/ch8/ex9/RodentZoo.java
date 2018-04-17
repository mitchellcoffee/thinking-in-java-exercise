package ch8.ex9;

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
        for (Rodent rodent : rodents) {
            rodent.eat();
        }
    }
}

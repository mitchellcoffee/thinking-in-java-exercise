package ch9.ex1;

interface Rodent {
    void eat();
}


class Mouse implements Rodent {
    public void eat() {
        System.out.println("Mouse eat");
    }
}

public class RodentZoo {

    public static void main(String[] args) {
        Rodent rodent = new Mouse();
        rodent.eat();
    }
}

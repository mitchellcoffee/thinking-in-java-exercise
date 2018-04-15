package ch7.ex17;

public class Frog extends Amphibian {

    @Override
    protected void swim() {
        System.out.println("f swim");
    }

    @Override
    protected void speak() {
        System.out.println("f speak");
    }

    @Override
    void eat() {
        System.out.println("f eat");
    }

    static void grow(Amphibian a) {
        System.out.println("f grow");
        a.eat();
    }

    public static void main(String[] args) {
        Frog f = new Frog();
        f.swim();
        f.speak();
        f.eat();
        f.grow(f);
        Amphibian.grow(f);
    }
}

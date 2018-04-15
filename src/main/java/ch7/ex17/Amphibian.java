package ch7.ex17;

public class Amphibian {

    protected void swim() {
        System.out.println("a swim");
    }

    protected void speak() {
        System.out.println("a speak");
    }

    void eat() {
        System.out.println("a eat");
    }

    static void grow(Amphibian a) {
        System.out.println("a grow");
        a.eat();
    }

}

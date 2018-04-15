package ch7.ex16;

public class Frog extends Amphibian {

    @Override
    public void method() {
        System.out.println("Frog");
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        frog.method();
        ((Amphibian)frog).method();
        frog.grow(frog);
        Amphibian amphibian = new Frog();
        amphibian.method();
    }
}

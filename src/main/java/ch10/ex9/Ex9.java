package ch10.ex9;

public class Ex9 {

    Outer outer() {
        class Inner implements Outer {

            public void say(String s) {
                System.out.println("inner: " + s);
            }
        }

        return new Inner();
    }

    public static void main(String[] args) {
        Ex9 ex9 = new Ex9();
        Outer outer = ex9.outer();
        outer.say("123");
    }

}

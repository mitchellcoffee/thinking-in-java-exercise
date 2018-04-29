package ch10.ex21;

public class Ex21 implements Ex21Interface {
    public void say(String s) {
        System.out.println("ex21 say: " + s);
    }

    public static void main(String[] args) {
        Ex21 ex21 = new Ex21();
        ex21.say("123");
        Ex21Interface.Ex21Nested.says(ex21, "321");
    }
}

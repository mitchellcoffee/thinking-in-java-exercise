package ch10.ex20;

public class Ex20 implements Ex20Interface {
    public void say() {
        System.out.println("ex20");
    }

    public static void main(String[] args) {
        Ex20Interface ex20  = new Ex20();
        ex20.say();
        Ex20Nested n = new Ex20Nested();
        n.say();
    }
}

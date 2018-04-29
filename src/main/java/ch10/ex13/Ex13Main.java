package ch10.ex13;

public class Ex13Main {

    public Ex13Interface makeInterface() {
        return new Ex13Interface() {
            public void say(String s) {
                System.out.println("say: " + s);
            }
        };
    }

    public static void main(String[] args) {
        Ex13Main main = new Ex13Main();
        main.makeInterface().say("123");
    }

}

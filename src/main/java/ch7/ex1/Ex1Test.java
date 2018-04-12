package ch7.ex1;

public class Ex1Test {

    private String s;

    public Ex1Test() {
        System.out.println("Ex1Test");
        s = "constructed";
    }

    @Override
    public String toString() {
        return s;
    }
}

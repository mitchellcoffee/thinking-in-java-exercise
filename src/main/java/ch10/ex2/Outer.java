package ch10.ex2;

public class Outer {

    private String s;

    public Outer(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "Outer{" +
                "s='" + s + '\'' +
                '}';
    }
}

package ch10.ex15;

public class Ex15Base {

    protected String s;

    public Ex15Base(String s) {
        this.s = s;
    }

    public void say() {
        System.out.println("say " + s);
    }
}

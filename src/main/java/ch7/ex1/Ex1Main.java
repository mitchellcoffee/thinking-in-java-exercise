package ch7.ex1;

public class Ex1Main {

    private Ex1Test ex1Test;

    public Ex1Main() {
        System.out.println("Ex1Main()");
    }

    @Override
    public String toString() {
        if (ex1Test == null) {
            ex1Test = new Ex1Test();
        }
        return "Ex1Main: " + ex1Test.toString();
    }

    public static void main(String[] args) {
        Ex1Main ex1Main = new Ex1Main();
        System.out.println(ex1Main);
    }
}

package ch10.ex18;

public class Ex18 {
    public Ex18() {
        System.out.println("Ex18()");
    }

    public static class Ex18Nest1 {
        public Ex18Nest1() {
            System.out.println("Ex18Nest1()");
        }
    }

    public static class Ex18Nest2 {
        public Ex18Nest2() {
            System.out.println("Ex18Nest2");
        }
    }

    public static void main(String[] args) {
        Ex18Nest1 nest1 = new Ex18Nest1();
        Ex18Nest2 nest2 = new Ex18Nest2();
    }
}

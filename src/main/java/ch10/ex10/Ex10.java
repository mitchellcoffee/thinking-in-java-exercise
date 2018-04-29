package ch10.ex10;

public class Ex10 {

    Ex10Interface make(boolean b) {
        if (b) {
            class Ex10Inner implements Ex10Interface {

                public void say() {
                    System.out.println("ex10 inner say");
                }
            }
            Ex10Inner ex10Inner = new Ex10Inner();
            return ex10Inner;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        Ex10 ex10 = new Ex10();
        ex10.make(true).say();
    }

}

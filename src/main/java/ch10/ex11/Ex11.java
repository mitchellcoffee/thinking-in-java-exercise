package ch10.ex11;

public class Ex11 {

    private class Ex11Private implements Ex11Interface {
        public void say(String s) {
            System.out.println("ex11 private say: " + s);
        }
    }

    public Ex11Interface makeEx11() {
        return new Ex11Private();
    }

    public static void main(String[] args) {
        Ex11 ex11 = new Ex11();
        ex11.makeEx11().say("123");
    }

}

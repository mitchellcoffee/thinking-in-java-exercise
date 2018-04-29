package ch10.ex15;

public class Ex15 {

    public Ex15Base makeBase(String s) {
        return new Ex15Base(s) {
            @Override
            public void say() {
                System.out.println("inner say " + s);
            }
        };
    }

    public static void main(String[] args) {
        Ex15Base ex15Base = new Ex15().makeBase("12");
        ex15Base.say();
    }
}

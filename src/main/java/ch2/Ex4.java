package ch2;

public class Ex4 {

    public static void main(String[] args) {
        class DataOnly {
            int i;
            double d;
            boolean b;
            void show() {
                System.out.println(i);
                System.out.println(d);
                System.out.println(b);
            }
        }
        DataOnly data = new DataOnly();
        data.i = 3;
        data.d = 3.14;
        data.b = false;
        data.show();
    }

}

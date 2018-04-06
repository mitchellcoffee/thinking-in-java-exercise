package ch2;

public class Ex5 {
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
        data.i = 111;
        data.d = 222.14;
        data.b = false;
        data.show();
    }

}

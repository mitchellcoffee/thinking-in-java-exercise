package ch4;

public class Ex9 {

    public static void phb(int size) {
        int p = 1;
        int q = 1;
        for (int i = 0; i < size; ++i) {
            if (i == 0) {
                System.out.println(p);
            } else if (i == 1) {
                System.out.println(q);
            } else {
                int temp = q;
                q = p + q;
                p = temp;
                System.out.println(q);
            }
        }
    }

    public static void main(String[] args) {
        phb(10);
    }

}

package ch3;

public class Ex12 {

    public static void main(String[] args) {
        int h = -1;
        System.out.println(Integer.toBinaryString(h));
        h <<= 1;
        System.out.println(Integer.toBinaryString(h));
        for (int i = 0; i < 32; ++i) {
            System.out.println(Integer.toBinaryString(h>>>=1));
        }
    }
}

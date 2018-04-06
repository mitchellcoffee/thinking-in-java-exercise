package ch3;

public class Ex11 {
    public static void main(String[] args) {
        int h = 0x10000000;
        System.out.println(Integer.toBinaryString(h));
        for (int i = 0; i < 28; i++) {
            System.out.println(h>>=1);
            System.out.println(Integer.toBinaryString(h));
        }
    }
}

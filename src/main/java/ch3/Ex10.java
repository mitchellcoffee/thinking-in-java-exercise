package ch3;

public class Ex10 {

    public static void main(String[] args) {
        int p = 0xAAAA;
        int q = 0x5555;
        System.out.println(Integer.toBinaryString(p&q));
        System.out.println(Integer.toBinaryString(p|q));
        System.out.println(Integer.toBinaryString(p^q));
        System.out.println(Integer.toBinaryString(~p));
        System.out.println(Integer.toBinaryString(~q));
    }

}

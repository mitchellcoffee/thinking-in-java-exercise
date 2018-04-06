package ch3;

public class Ex13 {

    private static String binaryChar(char c) {
        return Integer.toBinaryString(c);
    }

    public static void main(String[] args) {
        System.out.println(binaryChar('a'));
        System.out.println(binaryChar('2'));
        System.out.println(binaryChar('p'));
    }

}

package ch4;

public class Ex5 {

    static void binaryPrint(int i) {
        if (i == 0) {
            System.out.println(0);
        } else {
            int nlz = Integer.numberOfLeadingZeros(i);
            i <<= nlz;
            for (int p = 0; p < 32 - nlz; ++p) {
                int n = (Integer.numberOfLeadingZeros(i) == 0) ? 1 : 0;
                System.out.println(n);
                i <<= 1;
            }
        }
    }

    public static void main(String[] args) {
        binaryPrint(0xAAAA);
    }

}

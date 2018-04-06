package ch4;

public class Ex6 {

    static int test(int testVal, int begin, int end) {
        if (begin > end) {
            System.out.println("end cannot be < begin");
            return 0;
        }
        if (testVal >= begin && testVal <= end) {
            return 1;
        } else if (testVal < begin || testVal > end) {
            return -1;
        }
        System.out.println("exception case");
        return 13;
    }

    public static void main(String[] args) {
        System.out.println(test(13, 0, 14));
        System.out.println(test(0,0,0));
        System.out.println(test(0, -1, -2));
    }

}

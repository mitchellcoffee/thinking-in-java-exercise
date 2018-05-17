package ch12.ex3;

public class Ex3 {

    public static void main(String[] args) {
        int[] ints = new int[1];
        try {
            ints[1] = 1;
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

package ch12.ex2;

public class Ex2 {

    public static void main(String[] args) {
        String s = null;
        try {
            int i = s.length();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

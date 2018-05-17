package ch12.ex8;

public class Ex8 {

    public static void main(String[] args) {
        String s = null;
        try {
            int i = s.length();
        } catch (NullPointerException npe) {
            System.out.println("in catch");
            System.out.println(npe);
        }
        int i = s.length();
    }
}

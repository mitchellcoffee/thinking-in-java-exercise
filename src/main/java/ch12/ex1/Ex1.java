package ch12.ex1;

public class Ex1 {

    public static void main(String[] args) {
        try {
            throw new Exception("abc");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());
            System.out.println(e);
        } finally {
            System.out.println("in finally");
        }
    }

}

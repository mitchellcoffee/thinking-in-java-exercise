package ch12.ex4;

class CustomException extends Exception {

    private String m;

    public String getM() {
        return m;
    }

    public CustomException(String message) {
        super(message);
        m = message;
    }
}

public class Ex4 {

    public static void main(String[] args) {
        try {
            throw new CustomException("abc");
        } catch (CustomException e) {
            System.out.println(e.getM());
            System.out.println(e.getMessage());
        }
    }

}

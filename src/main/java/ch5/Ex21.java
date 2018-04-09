package ch5;

public class Ex21 {

    enum Cash {
        ONE,
        FIVE,
        TEN,
        TWENTY,
        FIFTY,
        HUNDRED
    }

    public static void main(String[] args) {
        for (Cash c : Cash.values()) {
            System.out.println(c.ordinal() + ":" + c);
        }
    }
}

package ch5;

public class Ex22 {

    enum Cash {
        ONE,
        FIVE,
        TEN,
        TWENTY,
        FIFTY,
        HUNDRED
    }

    public static void main(String[] args) {
        Cash c = Cash.FIVE;
        switch (c) {
            case ONE:
                System.out.println("1元");
                break;
            case FIVE:
                System.out.println("5元");
                break;
        }
    }
}

package ch12.ex21;

class BaseException extends Exception {}

class Base {
    Base() throws BaseException {
        throw new BaseException();
    }
}

class Derived extends Base {
    Derived() throws BaseException {
        super();
        /*try {
            super();
        } catch (BaseException e) {

        }*/
    }
}

public class Ex21 {

    public static void main(String[] args) {
        try {
            Derived d = new Derived();
        } catch (BaseException e) {
            System.out.println("BaseException caught in main");
        }
    }

}

package ch6.ex6;

public class Ex6 {

    public static void main(String[] args) {
        SomeData sd = new SomeData();
        System.out.println(sd.pro);
        DataChanger.change(sd, 1);
        System.out.println(sd.pro);
    }
}

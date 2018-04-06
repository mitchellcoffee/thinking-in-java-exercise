package ch3;

class Tube {
    float level;
}

public class Ex2 {

    public static void main(String[] args) {
        Tube t1 = new Tube();
        Tube t2 = new Tube();
        t1.level = 0.9f;
        t2.level = 1.4f;
        System.out.println(t1.level);
        System.out.println(t2.level);
        t1 = t2;
        System.out.println(t1.level);
        System.out.println(t2.level);
        t1.level = 0.2f;
        System.out.println(t1.level);
        System.out.println(t2.level);
    }
}

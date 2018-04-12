package ch7.ex3;

class Art {
    Art() {
        System.out.println("Art init");
    }
}

class Drawing extends Art {
    Drawing() {
        System.out.println("drawing init");
    }
}

public class Cartoon extends Drawing {


    public static void main(String[] args) {
        Cartoon c = new Cartoon();
    }
}

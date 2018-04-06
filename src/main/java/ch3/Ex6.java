package ch3;

class DogEx6 {
    String name;
    String says;
}

public class Ex6 {

    public static void main(String[] args) {
        DogEx6 d1 = new DogEx6();
        d1.name = "spot";
        d1.says = "Ruff!";
        DogEx6 d2 = new DogEx6();
        d2.name = d1.name;
        d2.says = d1.says;
        System.out.println(d1 == d2);
        System.out.println(d1.equals(d2));
    }
}

package ch15.ex2;

class Robot {
    private String name;
    public Robot(String name) { this.name = name; }
    public String toString() {
        return name;
    }
}

public class Holder<T> {

    private T x, y, z;

    public Holder(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    public T getZ() {
        return z;
    }

    public void setZ(T z) {
        this.z = z;
    }

    public String toString() {
        return x + ", " + y + ", " + z;
    }


    public static void main(String[] args) {
        Robot a = new Robot("bot1");
        Robot b = new Robot("bot2");
        Robot c = new Robot("bot3");
        Holder<Robot> h = new Holder<Robot>(a, b, c);
        System.out.println("Holding: " + h);
    }
}

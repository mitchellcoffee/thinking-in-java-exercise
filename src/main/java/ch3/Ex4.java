package ch3;


class VelocityCalculator {
    static float velocitry(float d, float t) {
        if (t == 0f) {
            return 0f;
        } else {
            return d / t;
        }
    }
}

public class Ex4 {

    public static void main(String[] args) {
        float d = 500.f;
        float t = 10.f;
        System.out.println(VelocityCalculator.velocitry(d, t));

    }
}

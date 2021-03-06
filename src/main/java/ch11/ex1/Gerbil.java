package ch11.ex1;

import java.util.ArrayList;

public class Gerbil {

    private int gerbilNumber;

    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    public void hop() {
        System.out.print(gerbilNumber);
        System.out.println(" is hopping");
    }

    public static void main(String[] args) {
        ArrayList<Gerbil> list = new ArrayList<Gerbil>();
        list.add(new Gerbil(1));
        list.add(new Gerbil(2));
        for (int i = 0; i < list.size(); ++i) {
            Gerbil gerbil = list.get(i);
            gerbil.hop();
        }
    }
}

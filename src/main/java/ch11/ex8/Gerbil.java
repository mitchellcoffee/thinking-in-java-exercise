package ch11.ex8;

import java.util.ArrayList;
import java.util.Iterator;

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
        list.add(new Gerbil(3));
        Iterator<Gerbil> it = list.iterator();
        while (it.hasNext()) {
            Gerbil g = it.next();
            g.hop();
        }
    }
}
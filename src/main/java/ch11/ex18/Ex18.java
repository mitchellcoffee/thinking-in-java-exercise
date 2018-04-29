package ch11.ex18;


import java.util.*;

class Gerbil {
    private int gerbilNo;

    public Gerbil(int gerbilNo) {
        this.gerbilNo = gerbilNo;
    }

    public void hop() {
        System.out.println("gerbil "+ gerbilNo + " hops");
    }
}

public class Ex18 {


    public static void main(String[] args) {
        Map<String, Gerbil> gerbils = new HashMap<String, Gerbil>();
        gerbils.put("Fuzzy", new Gerbil(0));
        gerbils.put("Spot", new Gerbil(1));
        gerbils.put("Speedy", new Gerbil(2));
        gerbils.put("Dopey", new Gerbil(3));
        System.out.println(gerbils);
        System.out.println();
        Set<String> sortedKeys = new TreeSet<String>(gerbils.keySet());
        System.out.println(sortedKeys);
        System.out.println();
        Map<String, Gerbil> sortedGerbils = new LinkedHashMap<String, Gerbil>();
        for (String s : sortedKeys) {
            sortedGerbils.put(s, gerbils.get(s));
        }
        System.out.println(sortedGerbils);
        sortedGerbils = new TreeMap<String, Gerbil>(gerbils);
        System.out.println(sortedGerbils);
    }



}

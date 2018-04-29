package ch11.ex19;

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


public class Ex19 {

    public static void main(String[] args) {
        Map<String, Gerbil> gerbils = new HashMap<String, Gerbil>();
        gerbils.put("Fuzzy", new Gerbil(0));
        gerbils.put("Spot", new Gerbil(1));
        gerbils.put("Speedy", new Gerbil(2));
        gerbils.put("Dopey", new Gerbil(3));
        gerbils.put("Happy", new Gerbil(4));
        System.out.println(gerbils);
        System.out.println();
        Set<String> hashedSet = new HashSet<String>(gerbils.keySet());
        System.out.println("HashSet: " + hashedSet);
        System.out.println();

        Map<String, Gerbil> hashedGerbils = new LinkedHashMap<String, Gerbil>();
        for (String s : hashedSet) {
            hashedGerbils.put(s, gerbils.get(s));
        }
        System.out.println(hashedGerbils);
        System.out.println();

        Set<String> linkedHashedKeys = new LinkedHashSet<String>(gerbils.keySet());
        System.out.println(linkedHashedKeys);
        System.out.println();

        Map<String, Gerbil> linkedHashedGerbils = new LinkedHashMap<String, Gerbil>();
        for (String s : linkedHashedKeys) {
            linkedHashedGerbils.put(s, gerbils.get(s));
        }
        System.out.println();
        System.out.println();
    }

}

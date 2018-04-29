package ch11.ex17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Gerbil {

    private String name;

    public Gerbil(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void hop() {
        System.out.println("Gerbil " + name + " hop");
    }

    public static void main(String[] args) {
        Map<String, Gerbil> gerbilMap = new HashMap<String, Gerbil>();
        Gerbil gerbil1 = new Gerbil("a");
        Gerbil gerbil2 = new Gerbil("b");
        Gerbil gerbil3 = new Gerbil("c");
        gerbilMap.put(gerbil1.getName(), gerbil1);
        gerbilMap.put(gerbil2.getName(), gerbil2);
        gerbilMap.put(gerbil3.getName(), gerbil3);
        Set<String> keys = gerbilMap.keySet();
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Gerbil gerbil = gerbilMap.get(key);
            gerbil.hop();
        }

    }
}

package ch14.ex14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Part2 {

    public String toString() {
        return getClass().getSimpleName();
    }

    static List<Class<? extends Part>> partClasses = new ArrayList<Class<? extends Part>>();


    static {
        partClasses.add(FuelFilter.class);
        partClasses.add(FanBelt.class);
    }

    private static Random rand = new Random();

    public static Part createRandom() {
        int n = rand.nextInt(partClasses.size());
        try {
            return partClasses.get(n).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }



}

public class RegisteredFactoriesB {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Part2.createRandom());
        }
    }
}
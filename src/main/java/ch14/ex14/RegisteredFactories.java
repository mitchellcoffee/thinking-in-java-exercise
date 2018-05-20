package ch14.ex14;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

interface Factory<T> {
    T create();
}

class Part {
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

    static List<Factory<? extends Part>> partFactories = new ArrayList<Factory<? extends Part>>();

    static {
        partFactories.add(new FuelFilter.Factory());
        partFactories.add(new FanBelt.Factory());
    }

    private static Random rand = new Random(47);
    public static Part createRandom() {
        int n = rand.nextInt(partFactories.size());
        return partFactories.get(n).create();
    }
}

class Filter extends Part {}

class FuelFilter extends Filter {

    public static class Factory implements ch14.ex14.Factory<FuelFilter> {

        public FuelFilter create() {
            return new FuelFilter();
        }
    }

}

class Belt extends Part {}

class FanBelt extends Belt {
    public static class Factory implements ch14.ex14.Factory<FanBelt> {

        public FanBelt create() {
            return new FanBelt();
        }
    }
}

public class RegisteredFactories {
    public static void main(String[] args) {
        for (int i = 0; i < 10; ++i) {
            System.out.println(Part.createRandom());
        }
    }
}

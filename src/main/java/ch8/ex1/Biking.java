package ch8.ex1;

class Cycle {
    @Override
    public String toString() {
        return "cycle";
    }
}

class Unicycle extends Cycle {
    @Override
    public String toString() {
        return "unicycle";
    }
}

class Bicycle extends Cycle {
    @Override
    public String toString() {
        return "bicycle";
    }
}

class Tricycle extends Cycle {
    @Override
    public String toString() {
        return "tricycle";
    }
}


public class Biking {

    public static void ride(Cycle c) {
        System.out.println(c);
    }

    public static void main(String[] args) {
        Cycle cycle = new Cycle();
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();
        ride(cycle);
        ride(unicycle);
        ride(bicycle);
        ride(tricycle);
    }

}

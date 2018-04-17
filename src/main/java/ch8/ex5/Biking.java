package ch8.ex5;

class Cycle {

    public int wheels() {
        return 0;
    }

    @Override
    public String toString() {
        return "cycle";
    }
}

class Unicycle extends Cycle {

    @Override
    public int wheels() {
        return 1;
    }

    @Override
    public String toString() {
        return "unicycle";
    }
}

class Bicycle extends Cycle {

    @Override
    public int wheels() {
        return 2;
    }

    @Override
    public String toString() {
        return "bicycle";
    }
}

class Tricycle extends Cycle {
    @Override
    public int wheels() {
        return 3;
    }

    @Override
    public String toString() {
        return "tricycle";
    }
}


public class Biking {
    public static void ride(Cycle c) {
        System.out.println("riding wheels: " + c.wheels());
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

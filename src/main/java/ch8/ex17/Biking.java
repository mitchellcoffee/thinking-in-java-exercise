package ch8.ex17;

class Cycle {
    @Override
    public String toString() {
        return "cycle";
    }
}

class Unicycle extends Cycle {

    public void balance() {
        System.out.println("Balance Unicycle");
    }

    @Override
    public String toString() {
        return "unicycle";
    }
}

class Bicycle extends Cycle {

    public void balance() {
        System.out.println("Balance Bicycle");
    }

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


        Cycle[] cycles = {
                new Unicycle(),
                new Bicycle(),
                new Tricycle()
        };
        ((Unicycle)cycles[0]).balance();
		((Bicycle)cycles[1]).balance();
		// RTTI: ClassCastException: Tricycle cannot be cast to Bicycle:
        // ((Bicycle)cycles[2]).balance();
    }

}

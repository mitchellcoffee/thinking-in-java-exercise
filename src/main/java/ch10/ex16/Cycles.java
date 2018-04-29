package ch10.ex16;

interface Cycle {
    void ride();
}

interface CycleFactory {
    Cycle getCycle();
}

class Unicycle implements Cycle {

    public void ride() {
        System.out.println("Unicycle ride");
    }

    public static CycleFactory factory = new CycleFactory() {
        public Cycle getCycle() {
            return new Unicycle();
        }
    };
}

class Bicycle implements Cycle {

    public void ride() {
        System.out.println("Bicycle ride");
    }

    public static CycleFactory factory = new CycleFactory() {
        public Cycle getCycle() {
            return new Bicycle();
        }
    };
}

class Tricycle implements Cycle {

    public void ride() {
        System.out.println("Tricycle ride");
    }

    public static CycleFactory factory = new CycleFactory() {
        public Cycle getCycle() {
            return new Tricycle();
        }
    };
}

public class Cycles {
    public static void rideCycle(CycleFactory f) {
        Cycle c = f.getCycle();
        c.ride();
    }

    public static void main(String[] args) {
        rideCycle(Unicycle.factory);
        rideCycle(Bicycle.factory);
        rideCycle(Tricycle.factory);
    }
}

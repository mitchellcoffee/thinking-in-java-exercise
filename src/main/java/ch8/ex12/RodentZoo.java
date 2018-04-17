package ch8.ex12;

import java.util.Random;

class Characteristic {
    private String s;
    public Characteristic(String s) {
        this.s = s;
        System.out.println("Creating Characteristic " + s);
    }
}

class Description {
    private String s;

    public Description(String s) {
        this.s = s;
        System.out.println("Create Description " + s);
    }
}

class Rodent {
    private String name = "Rodent";
    private Characteristic c = new Characteristic("has tail");
    private Description d = new Description("small mammal");

    public Rodent() {
        System.out.println("Rodent()");
    }

    protected void eat() {
        System.out.println("Rodent.eat()");
    }

    protected void run() {
        System.out.println("Rodent.run()");
    }

    protected void sleep() {
        System.out.println("Rodent.sleep()");
    }

    @Override
    public String toString() {
        return name;
    }
}

class Mouse extends Rodent {
    private String name = "Mouse";
    private Characteristic c = new Characteristic("likes cheese");
    private Description d = new Description("nocturnal");

    public Mouse() {
        System.out.println("Mouse()");
    }

    @Override
    protected void eat() {
        System.out.println("Mouse.eat()");
    }

    @Override
    protected void run() {
        System.out.println("Mouse.run()");
    }

    @Override
    protected void sleep() {
        System.out.println("Mouse.sleep()");
    }

    @Override
    public String toString() {
        return name;
    }
}

class Rat extends Rodent {
    private String name = "Rat";

    private Characteristic c = new Characteristic("larger");

	private Description d = new Description("black");

	public Rat() {
        System.out.println("Rat()");
    }

    @Override
    protected void eat() {
        System.out.println("Rat.eat()");
    }

    @Override
    protected void run() {
        System.out.println("Rat.run()");
    }

    @Override
    protected void sleep() {
        System.out.println("Rat.sleep()");
    }

    @Override
    public String toString() {
        return name;
    }
}

class Squirrel extends Rodent {

	private String name = "Squirrel";

	private Characteristic c = new Characteristic("climbs trees");

	private Description d = new Description("likes nuts");

	public Squirrel() {
        System.out.println("Squirrel()");
	}

	@Override
	protected void eat() {
        System.out.println("Squirrel.eat()");
	}
	@Override
	protected void run() {
        System.out.println("Squirrel.run()");
	}
	@Override
	protected void sleep() {
        System.out.println("Squirrel.sleep()");
	}

	@Override
	public String toString() {
	    return name;
	}
}

class RandomRodentGenerator {
    private Random rand = new Random();
    public Rodent next() {
        switch (rand.nextInt(3)) {
            default:
            case 0:
                return new Mouse();
            case 1:
                return new Rat();
            case 2:
                return new Squirrel();
        }
    }
}

public class RodentZoo {
    private static RandomRodentGenerator gen = new RandomRodentGenerator();

    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[1];
        for (Rodent r : rodents) {
            r = gen.next();
            System.out.println(r);
            r.eat();
        }
    }
}

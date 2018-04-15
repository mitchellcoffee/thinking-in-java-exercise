package ch7.ex11;

class Cleanser {
	private String s = "Cleanser";
	public void append(String a) { s += a; }
	public void dilute() { append(" dilute()"); }
	public void apply() { append(" apply()"); }
	public void scrub() { append(" scrub()"); }
	public String toString() { return s; }
	public static void main(String[] args) {
		Cleanser x = new Cleanser();
        System.out.println(x);
	}
}

public class DetergentDelegation {
    private Cleanser cleanser;
	private String s = "DetergentDelegation";
    private void append(String a) {
        s += a;
    }

    public DetergentDelegation(Cleanser cleanser) {
        this.cleanser = cleanser;
    }
    public void dilute() {
		cleanser.dilute();
	}
	public void apply() {
		cleanser.apply();
    }

	public void scrub() {
		append(" DetergentDelegation.scrub()");
		cleanser.scrub();
	}

	public void foam() { append(" foam()"); }
	public String toString() { return s + " " + cleanser; }

	public static void main(String[] args) {
		DetergentDelegation x = new DetergentDelegation(new Cleanser());
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
        System.out.println(x);
        System.out.println("Testing base class:");
		Cleanser.main(args);
	}
}

package ch7.ex2;

public class SubDetergent extends Detergent {
    @Override
    public void scrub() {
        append(" SubDetergent scrub()");
        super.scrub();
    }

    public void sterilize() {
        append(" sterilize() ");
    }

    public static void main(String[] args) {
        SubDetergent x = new SubDetergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        x.sterilize();
        System.out.println(x);
        System.out.println("Testing base class:");
        Detergent.main(args);
    }
}

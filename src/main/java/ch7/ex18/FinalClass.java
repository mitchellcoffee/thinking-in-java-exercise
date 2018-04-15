package ch7.ex18;

public class FinalClass {

    public static final int CLASS_CONSTANT = 1;

    public final int INSTANCE_CONSTANT = 2;

    public static void main(String[] args) {
        int i = FinalClass.CLASS_CONSTANT;
        FinalClass finalClass = new FinalClass();
        int j = finalClass.INSTANCE_CONSTANT;
        // finalClass.INSTANCE_CONSTANT = 3;
    }

}

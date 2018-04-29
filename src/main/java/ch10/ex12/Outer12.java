package ch10.ex12;

interface Inner12 {

    void modifyOuter();

}

public class Outer12 {

    private int oi = 1;

    private void hi() {
        System.out.println("Outer hi");
    }

    public Inner12 inner() {
        return new Inner12() {
            public void modifyOuter() {
                oi += 1;
                hi();
            }
        };
    }

    public void show() {
        System.out.println(oi);
    }

    public static void main(String[] args) {
        Outer12 outer12 = new Outer12();
        outer12.show();
        outer12.inner().modifyOuter();
        outer12.show();
    }

}

package ch10.ex20;

public interface Ex20Interface {

    void say();

    class Ex20Nested {
        public Ex20Nested() {
            System.out.println("Ex20Nested()");
        }

        public void say() {
            System.out.println("Ex20Nested");
        }
    }
}

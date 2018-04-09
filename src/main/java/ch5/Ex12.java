package ch5;

public class Ex12 {
    public static void main(String[] args) {
        class Tank {
            int howFull = 0;

            Tank(int fullness) {
                howFull = fullness;
            }

            Tank() {
                this(0);
            }

            void sayHowFull() {
                if (howFull == 0) {
                    System.out.println("Tank is empty");
                } else {
                    System.out.println("Tank is fulling status: " + howFull);
                }
            }

            void empty() {
                howFull = 0;
            }

            protected void finalize() throws Throwable {
                if (howFull != 0) {
                    System.out.println("Error: Tank is not empty");
                }
                super.finalize();
            }
        }

        Tank tank1 = new Tank();
        Tank tank2 = new Tank(3);
        Tank tank3 = new Tank(5);
        tank2.empty();
        System.out.println("Check tanks:");
		System.out.println("tank1: ");
		tank1.sayHowFull();
		System.out.println("tank2: ");
		tank2.sayHowFull();
		System.out.println("tank3: ");
		tank3.sayHowFull();
		System.out.println("first forced gc():");
		System.gc();
		// Force finalization on exit but using method
		// deprecated since JDK 1.1:
		System.out.println("try deprecated runFinalizersOnExit(true):");
		System.runFinalizersOnExit(true);
		System.out.println("last forced gc():");
		System.gc();
    }



}

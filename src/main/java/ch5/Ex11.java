package ch5;

public class Ex11 {

    public static void main(String[] args) {
        class WebBank {
            boolean loggedIn = false;

            WebBank(boolean logStatus) {
                loggedIn = logStatus;
            }

            void logOut() {
                loggedIn = false;
            }

            protected void finalize() throws Throwable {
                if (loggedIn) {
                    System.out.println("Error, strill logged in");
                    super.finalize();
                }
            }


        }
        WebBank w1 = new WebBank(true);
        WebBank w2 = new WebBank(true);
        new WebBank(true);
        w1.logOut();
        System.out.println("Try 1: ");
        System.runFinalization();
        System.out.println("Try 2: ");
        Runtime.getRuntime().runFinalization();
        System.out.println("Try 3: ");
        System.gc();
        System.out.println("Try 4: ");
        System.runFinalizersOnExit(true);
    }


}

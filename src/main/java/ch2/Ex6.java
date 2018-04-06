package ch2;

public class Ex6 {

    public static void main(String[] args) {
        class StoreStuff {
            int storage(String s) {
                return s.length() * 2;
            }
        }

        StoreStuff ss = new StoreStuff();
        System.out.println(ss.storage("storage"));
    }

}

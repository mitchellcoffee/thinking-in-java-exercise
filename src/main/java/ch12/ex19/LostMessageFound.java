package ch12.ex19;

class VeryImportantException extends Exception {
    public String toString() {
        return "A very important exception!";
    }
}

class HoHumException extends Exception {
    public String toString() {
        return "A trivial exception";
    }
}

public class LostMessageFound {

    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }
    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    public static void main(String[] args) {
        try {
            LostMessageFound lmf = new LostMessageFound();
            try {
                lmf.f();
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                lmf.dispose();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

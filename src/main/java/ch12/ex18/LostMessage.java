package ch12.ex18;

class VeryImportantException extends Exception {
    @Override
    public String toString() {
        return "A very important exception!";
    }
}

class HoHumException extends Exception {
    @Override
    public String toString() {
        return "A trivial exception";
    }
}

class MeaninglessException extends Exception {
    @Override
    public String toString() {
        return "A meaningless exception";
    }
}

public class LostMessage {

    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    void eliminate() throws MeaninglessException {
        throw new MeaninglessException();
    }

    public static void main(String[] args) {
        try {
            LostMessage lm = new LostMessage();
            try {
                try {
                    lm.f();
                    lm.dispose();
                } finally {
                    lm.eliminate();
                }
            } catch (Exception e) {
                System.out.println("1: " + e);
            }
        } catch (Exception e) {
            System.out.println("2: " + e);
        }
    }
}

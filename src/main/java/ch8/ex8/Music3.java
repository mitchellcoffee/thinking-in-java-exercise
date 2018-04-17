package ch8.ex8;

import java.util.Random;

enum Note {
    MIDDLE_C, C_SHAPRE, B_FLAT;
}

class Instrument {
    void play(Note n) {
        System.out.println("Instrument play() " + n);
    }

    @Override
    public String toString() {
        return "Instrument";
    }

    void adjust() {
        System.out.println("Adjust Instrument");
    }
}

class Wind extends Instrument {
    @Override
    void play(Note n) {
        System.out.println("Wind play() " + n);
    }

    @Override
    public String toString() {
        return "Wind";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Instrument");
    }
}

class Percussion extends Instrument {
    @Override
    void play(Note n) {
        System.out.println("Percussion play() " + n);
    }

    @Override
    public String toString() {
        return "Percussion";
    }

    @Override
    void adjust() {
        System.out.println("Adjust Percussion");
    }
}

class Stringed extends Instrument {
    @Override
    void play(Note n) {
        System.out.println("Stringed play() " + n);
    }

    @Override
    public String toString() {
        return "Stringed";
    }

    @Override
    void adjust() {
        System.out.println("Adjust stringed");
    }
}

class Brass extends Wind {
    @Override
    void play(Note n) {
        System.out.println("Brass play() " + n);
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Brass");
    }

    @Override
    public String toString() {
        return "Brass";
    }
}

class Woodwind extends Wind {
    @Override
    void play(Note n) {
        System.out.println("Woodwind play() " + n);
    }

    @Override
    public String toString() {
        return "Windwood";
    }
}

class RandomInstrumentGenerator {
    Random rand = new Random(1123);
    public Instrument generate() {
        switch (rand.nextInt(5)) {
            default:
            case 0:
                return new Brass();
            case 1:
                return new Percussion();
            case 2:
                return new Stringed();
            case 3:
                return new Wind();
            case 4:
                return new Woodwind();
        }
    }
}

public class Music3 {

    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            System.out.println(i);
            tune(i);
        }
    }

    static RandomInstrumentGenerator rig = new RandomInstrumentGenerator();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            rig.generate().play(Note.B_FLAT);
        }
    }

}
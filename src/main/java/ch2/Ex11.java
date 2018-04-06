package ch2;



public class Ex11 {
    public static void main(String[] args) {
        AllTheColorsOfTheRainbow atc = new AllTheColorsOfTheRainbow();
        atc.changeColor(6);
        atc.changeTheHueOfTheColor(7);
        System.out.println(atc.anIntegerRepresentingColors);
        System.out.println(atc.hue);
    }
}


class AllTheColorsOfTheRainbow {
    int anIntegerRepresentingColors = 0;
    int hue = 0;

    void changeTheHueOfTheColor(int newHue) {
        hue = newHue;
    }

    int changeColor(int newColor) {
        return anIntegerRepresentingColors = newColor;
    }
}
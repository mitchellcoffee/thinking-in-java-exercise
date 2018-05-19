package ch13.ex14;

import java.util.Arrays;

import static net.mindview.util.Print.print;

public class SplitDemo {

    public static void main(String[] args) {
        String input = "This!!unusual use!!of exclamation!!points";
        print(Arrays.toString(input.split("!!")));
        print(Arrays.toString(input.split("!!", 3)));
    }
}

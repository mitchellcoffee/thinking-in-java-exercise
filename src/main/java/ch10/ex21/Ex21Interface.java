package ch10.ex21;

public interface Ex21Interface {

    void say(String s);

    class Ex21Nested {
        public static void says(Ex21Interface ex21Interface, String s) {
            ex21Interface.say(s);
        }
    }
}

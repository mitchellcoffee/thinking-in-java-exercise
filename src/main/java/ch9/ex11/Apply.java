package ch9.ex11;


import java.util.Arrays;

class Processor {
    public String name() {
        return getClass().getSimpleName();
    }

    Object process(Object input) {
        return input;
    }
}

class Upcase extends Processor {
    String process(Object input) {
        return ((String)input).toUpperCase();
    }
}

class Downcase extends Processor {
    String process(Object input) {
        return ((String)input).toLowerCase();
    }
}

class Splitter extends Processor {
    @Override
    String process(Object input) {
        return Arrays.toString(((String)input).split(" "));
    }
}

class StringMixerProcess extends Processor {
    StringMixer mixer;

    public StringMixerProcess(StringMixer mixer) {
        this.mixer = mixer;
    }

    @Override
    String process(Object input) {
        return mixer.process((String)input);
    }
}

public class Apply {
    public static void process(Processor p, Object s) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }

    public static String s = "abcdefgHIJKLMN";

    public static void main(String[] args) {
        process(new Upcase(), s);
        process(new Downcase(), s);
        process(new Splitter(), s);
        process(new StringMixerProcess(new StringMixer()), s);
    }
}

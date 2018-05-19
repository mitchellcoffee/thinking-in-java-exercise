package ch13.ex17;

import net.mindview.util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex17 {

    public static void main(String[] args) {
        if(args.length < 1) {
            System.out.println("Usage: fileName");
            System.exit(0);
        }
        Pattern p = Pattern.compile("(//\\s.+)|(/\\*\\s+.+)|(\\*\\s+.+)");

        int index = 0;
        Matcher m = p.matcher(""); // creates emtpy Matcher object
        System.out.println(args[0] + " comments: ");
        for(String line : new TextFile(args[0])) {
            m.reset(line);
            while(m.find())
                System.out.println(index++ + ": " + m.group());
        }
    }
}

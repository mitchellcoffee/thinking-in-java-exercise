package ch12.ex7;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class Ex7 {

    private static Logger logger = Logger.getLogger("Ex7 Exceptions");

    static void logException(Exception e) {
        StringWriter sw = new StringWriter();
        e.printStackTrace(new PrintWriter(sw));
        logger.severe(sw.toString());
    }

    public static void main(String[] args) {
        int[] ints = new int[1];
        try {
            ints[1] = 1;
        } catch (Exception e) {
            logException(e);
        }
    }

}

package ch12.ex26;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainException {

    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("null.jv");
        file.close();
    }
}

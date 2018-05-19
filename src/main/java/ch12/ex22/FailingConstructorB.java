package ch12.ex22;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FailingConstructorB {

    private BufferedReader in;

    public FailingConstructorB(String fname) throws Exception {
        try {
            in = new BufferedReader(new FileReader(fname));
        } catch (FileNotFoundException e) {
            System.out.println("Could not find file " + fname);
            throw e;
        } catch (Exception e) {
            try {
                in.close();
            } catch (IOException e2) {
                System.out.println("in.close failed");
            }
            throw e;
        }
    }

    public String getLine() {
        String s;
        try {
            s = in.readLine();
        } catch(IOException e) {
            throw new RuntimeException("readLine() failed");
        }
        return s;
    }

    public static void main(String[] args) {
        try {
            FailingConstructorB fc = new FailingConstructorB("AlwaysFinally.java");
            try {
                String s;
                int i = 1;
                while((s = fc.getLine()) != null) {
                    // code to print to new file:
                    // println(i + " " + s);
                    // i++;
                }
            } catch (Exception e) {
                System.out.println("Exception caught in main()");
                e.printStackTrace(System.err);
            }
        } catch (Exception e) {
            System.out.println("FailingConstructorB failed");
        }

    }

}

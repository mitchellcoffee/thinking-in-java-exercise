package ch12.ex24;

import java.io.*;

public class FailingConstructor24b {
    private BufferedReader in;
    public FailingConstructor24b(String fname) throws Exception {
        try {
            in = new BufferedReader(new FileReader(fname));
        } catch(FileNotFoundException e) {
            System.out.println("Could not find file " + fname);
            throw e;
        } catch(Exception e) {
            try {
                in.close();
            } catch(IOException e2) {
                System.out.println("in.close() failed");
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
    public void dispose() {
        try {
            in.close();
            System.out.println("dispose() successful");
        } catch(IOException e2) {
            throw new RuntimeException("in.close() failed");
        }
    }
    public static void main(String[] args) {
        try {
            FailingConstructor24b fc =
                    new FailingConstructor24b("AlwaysFinally.java");
            try {
                String s;
                int i = 1;
                while((s = fc.getLine()) != null) {
                    // code to print to new file:
                    // println(i + " " + s);
                    // i++;
                }
            } catch(Exception e) {
                System.out.println("Exception caught in main()");
                e.printStackTrace(System.err);
            } finally {
                fc.dispose();
            }
        } catch(Exception e) {
            System.out.println("FailingConstructor22b construction failed");
        }
    }
}

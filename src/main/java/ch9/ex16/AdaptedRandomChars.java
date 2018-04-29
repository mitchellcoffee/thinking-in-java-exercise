package ch9.ex16;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

public class AdaptedRandomChars extends RandomChars implements Readable {

    private int count;

    public AdaptedRandomChars(int count) {
        this.count = count;
    }

    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0) {
            return -1;
        }
        String result = next() + " ";
        cb.append(result);
        return result.length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new AdaptedRandomChars(10));
        while (scanner.hasNext()) {
            System.out.print(scanner.next() + " ");
        }
    }
}

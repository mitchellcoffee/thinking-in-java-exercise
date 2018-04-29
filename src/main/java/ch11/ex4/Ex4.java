package ch11.ex4;


import java.util.*;

class Generator {
    int key = 0;

    public String next() {
        switch (key) {
            default:
			case 0 : key++; return "Snow White";
			case 1 : key++; return "Bashful";
			case 2 : key++; return "Doc";
			case 3 : key++; return "Dopey";
			case 4 : key++; return "Grumpy";
			case 5 : key++; return "Happy";
			case 6 : key++; return "Sleepy";
			case 7 : key = 0; return "Sneezy";
        }
    }

    public void fillA(String[] a) {
        for (int i = 0; i < a.length; ++i) {
            a[i] = next();
        }
    }

    public Collection fill(Collection<String> c, int n) {
        for (int i = 0; i < n; ++i) {
            c.add(next());
        }
        return c;
    }
}

public class Ex4 {

    public static void main(String[] args) {
        Generator generator = new Generator();
        String[] a = new String[8];
        generator.fillA(a);
        System.out.println(Arrays.toString(a));
        System.out.println(generator.fill(new ArrayList<String>(), 8));
        System.out.println(generator.fill(new LinkedList<String>(), 8));
        System.out.println(generator.fill(new HashSet<String>(), 8));
        System.out.println(generator.fill(new LinkedHashSet<String>(), 8));
        System.out.println(generator.fill(new TreeSet<String>(), 8));


    }

}

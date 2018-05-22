package ch15.ex14;


import net.mindview.util.BasicGenerator;
import net.mindview.util.Generator;




public class BasicGeneratorDemo {

    public static void main(String[] args) {
        Generator<CountedObject> gen = BasicGenerator.create(CountedObject.class);
        for (int i = 0; i < 5; ++i) {
            System.out.println(gen.next());
        }

        Generator<CountedObject> gen2 = new BasicGenerator<CountedObject>(CountedObject.class);
        for (int i = 0; i < 5; ++i) {
            System.out.println(gen2.next());
        }

    }

}

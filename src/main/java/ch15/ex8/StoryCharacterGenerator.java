package ch15.ex8;

import net.mindview.util.Generator;

import java.util.Iterator;
import java.util.Random;

public class StoryCharacterGenerator implements Generator<StoryCharacter>, Iterable<StoryCharacter> {

    private Class[] types = {DarthVader.class, JabbaTheHut.class, LukeSkywalker.class, Yoda.class};
    private static Random rand = new Random();

    public StoryCharacterGenerator() {
    }

    private int size = 0;

    public StoryCharacterGenerator(int size) {
        this.size = size;
    }

    public Iterator<StoryCharacter> iterator() {
        return new StoryCharacterIterator();
    }

    public StoryCharacter next() {
        try {
            return (StoryCharacter)types[rand.nextInt(types.length)].newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    class StoryCharacterIterator implements Iterator<StoryCharacter> {

        int count = size;

        public boolean hasNext() {
            return count > 0;
        }

        public StoryCharacter next() {
            count--;
            return StoryCharacterGenerator.this.next();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static void main(String[] args) {
        StoryCharacterGenerator gen = new StoryCharacterGenerator();
        for (int i = 0; i < 5; ++i) {
            System.out.println(gen.next());
        }
        for (StoryCharacter s : new StoryCharacterGenerator(5)) {
            System.out.println(s);
        }
    }
}

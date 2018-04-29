package ch11.ex32;

import java.util.*;

class Pet {
    String name;

    public Pet(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class NonCollectionSequence implements Iterable<Pet> {

    private Pet[] pets;

    public NonCollectionSequence(int n) {
        pets = new Pet[n];
        for (int i = 0; i < n; ++i) {
            pets[i] = new Pet("Pet" + i);
        }
    }

    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {

            private int index = 0;

            public boolean hasNext() {
                return index < pets.length;
            }

            public Pet next() {
                return pets[index++];
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public Iterable<Pet> reversed() {
        return new Iterable<Pet>() {

            public Iterator<Pet> iterator() {
                return new Iterator<Pet>() {

                    int current = pets.length - 1;

                    public boolean hasNext() {
                        return current > -1;
                    }

                    public Pet next() {
                        return pets[current--];
                    }

                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }

    public Iterable<Pet> randomized() {
        return new Iterable<Pet>() {
            public Iterator<Pet> iterator() {
                List<Pet> shuffled = new ArrayList<Pet>(Arrays.asList(pets));
                Collections.shuffle(shuffled, new Random());
                return shuffled.iterator();
            }
        };
    }

    public static void main(String[] args) {
        NonCollectionSequence nc = new NonCollectionSequence(10);
        for (Pet p : nc) {
            System.out.println(p);
        }
        for (Pet p : nc.reversed()) {
            System.out.println(p);
        }
        for (Pet p : nc.randomized()) {
            System.out.println(p);
        }
    }
}

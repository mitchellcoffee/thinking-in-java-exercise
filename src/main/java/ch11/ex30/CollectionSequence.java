package ch11.ex30;

import java.util.Collection;
import java.util.Iterator;

class Pet {

}

public class CollectionSequence implements Collection<Pet> {

    private Pet[] pets = new Pet[10];

    public int size() {
        return pets.length;
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


    public boolean isEmpty() {
        return this.size() == 0;
    }

    public boolean contains(Object o) {
        throw  new UnsupportedOperationException();
    }

    public Object[] toArray() {
        return pets;
    }

    public <T> T[] toArray(T[] a) {
        throw  new UnsupportedOperationException();
    }

    public boolean add(Pet pet) {
        throw  new UnsupportedOperationException();
    }

    public boolean remove(Object o) {
        throw  new UnsupportedOperationException();
    }

    public boolean containsAll(Collection<?> c) {
        throw  new UnsupportedOperationException();
    }

    public boolean addAll(Collection<? extends Pet> c) {
        throw  new UnsupportedOperationException();
    }

    public boolean removeAll(Collection<?> c) {
        throw  new UnsupportedOperationException();
    }

    public boolean retainAll(Collection<?> c) {
        throw  new UnsupportedOperationException();
    }

    public void clear() {
        if (this.size() != 0) {
            for (Pet p : pets) {
                p = null;
            }
        }
    }
}

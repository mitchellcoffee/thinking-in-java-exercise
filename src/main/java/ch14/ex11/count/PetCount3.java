package ch14.ex11.count;

import ch14.ex11.creator.LiteralPetCreator;
import ch14.ex11.creator.Pets;
import ch14.ex11.pets.Pet;
import net.mindview.util.MapData;
import net.mindview.util.Print;

import java.util.LinkedHashMap;
import java.util.Map;

public class PetCount3 {

    static class PetCounter extends LinkedHashMap<Class<? extends Pet>, Integer> {
        public PetCounter() {
            super(MapData.map(LiteralPetCreator.allTypes, 0));
        }

        public void count(Pet pet) {
            for (Map.Entry<Class<? extends Pet>, Integer> pair : entrySet()) {
                if (pair.getKey().isInstance(pet)) {
                    put(pair.getKey(), pair.getValue() + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        PetCounter petCount = new PetCounter();
        for (Pet pet : Pets.createArray(20)) {
            Print.printnb(pet.getClass().getSimpleName() + " ");
            petCount.count(pet);
        }
        Print.print();
        Print.print(petCount);
    }
}

package ch14.ex11.creator;

import ch14.ex11.pets.Pet;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator {

    public static List<Class<? extends Pet>> types = new ArrayList<Class<? extends Pet>>();

    private static String[] typeNames = {
            "ch14.ex11.pets.Mutt",
            "ch14.ex11.pets.Pug",
            "ch14.ex11.pets.EgyptianMau",
            "ch14.ex11.pets.Manx",
            "ch14.ex11.pets.Cymric",
            "ch14.ex11.pets.Rat",
            "ch14.ex11.pets.Mouse",
            "ch14.ex11.pets.Hamster",
            "ch14.ex11.pets.Gerbil"
    };

    private static void loader() {
        try {
            for (String name : typeNames) {
                types.add((Class<? extends Pet>)Class.forName(name));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    static {
        loader();
    }

    public List<Class<? extends Pet>> types() {
        return types;
    }
}

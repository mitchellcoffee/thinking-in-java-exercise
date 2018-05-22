package ch15.ex22;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Building {}

class House extends Building {
    private String location;
    private Integer area;

    public House() {
    }

    public House(String location) {
        this.location = location;
    }

    public House(Integer area) {
        this.area = area;
    }

    public House(String location, Integer area) {
        this.location = location;
        this.area = area;
    }

    @Override
    public String toString() {
        return "House{" +
                "location='" + location + '\'' +
                ", area=" + area +
                '}';
    }
}


public class ClassTypeCreator<T> {

    Class<T> kind;

    public ClassTypeCreator(Class<T> kind) {
        this.kind = kind;
    }

    public Object createNew(String typename) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return Class.forName(typename).newInstance();
    }

    public Object createNew(String typename, Object... args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        switch (args.length) {
            case 1:
                return Class.forName(typename).getConstructor(args[0].getClass()).newInstance(args[0]);
            case 2:
                return Class.forName(typename).getConstructor(args[0].getClass(), args[1].getClass()).newInstance(args[0], args[1]);
        }
        return null;
    }

    public static void main(String[] args) {
        ClassTypeCreator<Building> ctcb = new ClassTypeCreator<Building>(Building.class);
        ClassTypeCreator<House> ctch = new ClassTypeCreator<House>(House.class);
        try {
            Building b = (Building)ctcb.createNew("ch15.ex22.Building");
            Constructor[] ctors = House.class.getConstructors();
            for(Constructor ctor : ctors)
                System.out.println(ctor);
            // create 3 new House objects:
            House h = (House)ctch.createNew("ch15.ex22.House", "Hawaii");
            House h2 = (House)ctch.createNew("ch15.ex22.House", 3000);
            House h3 = (House)ctch.createNew("ch15.ex22.House", "Manila", 5000);
            System.out.println("Constructed House objects:");
            System.out.println(h);
            System.out.println(h2);
            System.out.println(h3);
        } catch(IllegalAccessException e) {
            System.out.println("IllegalAccessException in main");
        } catch(InstantiationException e) {
            System.out.println("InstantiationException in main");
        } catch(ClassNotFoundException e) {
            System.out.println("ClassNotFoundException in main");
        } catch(NoSuchMethodException e) {
            System.out.println("NoSuchMethodException in main");
        } catch(InvocationTargetException e) {
            System.out.println("InvocationTargetException in main");
        }

    }

}

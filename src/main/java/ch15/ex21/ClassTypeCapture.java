package ch15.ex21;

import java.util.HashMap;
import java.util.Map;

import static net.mindview.util.Print.print;

class Building {}

class House extends Building {}

public class ClassTypeCapture<T> {

    Class<T> kind;

    Map<String, Class<?>> map;

    public ClassTypeCapture(Class<T> kind) {
        this.kind = kind;
    }

    public ClassTypeCapture(Class<T> kind, Map<String, Class<?>> map) {
        this.kind = kind;
        this.map = map;
    }

    public boolean f(Object arg) {
        return kind.isInstance(arg);
    }

    public void addType(String typename, Class<?> kind) {
        map.put(typename, kind);
    }

    public Object createNew(String typename) throws IllegalAccessException, InstantiationException {
        if (map.containsKey(typename)) {
            return map.get(typename).newInstance();
        }
        System.out.println(typename + " class not available");
        return null;
    }

    public static void main(String[] args) {
        ClassTypeCapture<Building> ctt1 = new ClassTypeCapture<Building>(Building.class);
        System.out.println(ctt1.f(new Building()));
        System.out.println(ctt1.f(new House()));

        ClassTypeCapture<House> ctt2 = new ClassTypeCapture<House>(House.class);
        System.out.println(ctt2.f(new Building()));
        System.out.println(ctt2.f(new House()));

        ClassTypeCapture<Building> ct = new ClassTypeCapture<Building>(Building.class, new HashMap<String, Class<?>>());
        ct.addType("House", House.class);
        ct.addType("Building", Building.class);
        System.out.println(ct.map);

        try {
            Building b = (Building)ct.createNew("Building");
            House h = (House)ct.createNew("House");
            System.out.print("b.getClass().getName(): ");
            System.out.println(b.getClass().getName());
            print("h.getClass().getName(): ");
            System.out.println(h.getClass().getName());
            print("House h is instance House: ");
            System.out.println(h instanceof House);
            print("House h is instance of Building: ");
            System.out.println(h instanceof Building);
            print("Building b is instance of House: ");
            System.out.println(b instanceof House);
            ct.createNew("String");  // String class not available

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

}

package ch7.ex14;

class Engine {
    void start() {}

    void rev() {}

    void stop() {}

    void service() {
        System.out.println("service");
    }
}

class Wheel {
    void inflate(int spi) {}
}

class Window {
    void rollup() {}

    void rolldown() {}
}

class Door {
    Window window = new Window();
    void open() {}

    void close() {}
}


public class Car {

    Engine engine = new Engine();
    Wheel[] wheels = new Wheel[4];
    Door left = new Door(), right = new Door();

    public Car() {
        for (int i = 0; i < 4; ++i) {
            wheels[i] = new Wheel();
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.left.window.rollup();
        car.wheels[0].inflate(22);
        car.engine.service();
    }
}

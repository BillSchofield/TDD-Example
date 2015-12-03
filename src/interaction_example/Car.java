package interaction_example;

import java.util.Collection;
import java.util.Comparator;

public class Car {
    private Engine engine;
    private String make;

    public Car(Engine engine, String make) {
        this.engine = engine;
        this.make = make;
    }

    public void accelerate(){
        engine.increaseThrottle();
    }

    private String make() {
        return make;
    }

    private static class CarComparator implements Comparator<Car> {
        public int compare(Car o1, Car o2) {
            return o1.make().compareTo(o2.make());
        }
    }
}

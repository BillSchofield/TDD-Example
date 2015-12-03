package interaction_example;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Engine electricEngine = new ElectricEngine();
        Car car = new Car(engine, "Buick");

        car.accelerate();
    }
}

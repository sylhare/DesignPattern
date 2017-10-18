package pattern.behavioral.template;

/**
 * Created by sylhare in 2017.
 */
public class Car extends Vehicle {
    @Override
    void transport() {
        System.out.println("Riding at 120km/h to the destination");
    }

    @Override
    void start() {
        System.out.println("Turning On the engine");
    }

    @Override
    void switchOff() {
        System.out.println("Kill the engine and close the car");

    }
}

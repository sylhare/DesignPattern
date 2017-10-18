package pattern.behavioral.template;

/**
 * Created by sylhare in 2017.
 */
public class Plane extends Vehicle {
    @Override
    void transport() {
        System.out.println("Flying at 3000km/h to the destination");
    }

    @Override
    void start() {
        System.out.println("Firing On the engine and take off");
    }

    @Override
    void switchOff() {
        System.out.println("Land and swiftly cut the engine");

    }
}

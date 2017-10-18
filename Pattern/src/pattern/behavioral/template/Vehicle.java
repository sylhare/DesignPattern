package pattern.behavioral.template;

/**
 * Created by sylhare in 2017.
 */
public abstract class Vehicle {
    abstract void transport();
    abstract void start();
    abstract void switchOff();

    //template method
    public final void run(){
        // start the vehicle
        start();

        // let the vehicle go to its destination
        transport();

        // turn off the vehicle
        switchOff();
    }
}

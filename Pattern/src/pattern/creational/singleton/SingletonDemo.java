package pattern.creational.singleton;

/**
 * Created by sylhare in 2017.
 */
public class SingletonDemo {
    public static void demo() {

        //illegal construct
        //Compile Time Error: The constructor Singleton() is not visible (private)
        //Singleton object2 = new Singleton();

        //Get the only object available
        Singleton object = Singleton.getInstance();

        //show the message
        object.showMessage();
    }
}
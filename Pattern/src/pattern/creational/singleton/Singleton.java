package pattern.creational.singleton;

/**
 * Created by sylhare in 2017.
 */
public class Singleton {

    //Only singleton object created
    private static Singleton instance = new Singleton();

    //make the constructor private so that this class cannot be
    //instantiated
    private Singleton(){}

    //Get the only object available
    public static Singleton getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("I am a singleton!");
    }
}
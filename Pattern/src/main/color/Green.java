package main.color;

/**
 * Created by sylhare in 2017.
 */
public class Green extends Color implements Paint {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }

    @Override
    public String name() {
        return "Green";
    }

    @Override
    public float price() {
        return 16.9f;
    }
}
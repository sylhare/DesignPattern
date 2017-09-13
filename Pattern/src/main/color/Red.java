package main.color;

/**
 * Created by sylhare in 2017.
 */
public class Red extends Color implements Paint {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }

    @Override
    public String name() {
        return "Red";
    }

    @Override
    public float price() {
        return 43.0f;
    }
}
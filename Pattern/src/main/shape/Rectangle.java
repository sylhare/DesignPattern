package main.shape;

/**
 * Created by sylhare in 2017.
 */
public class Rectangle extends Shape implements Type {

    public Rectangle(){
        edge = 4;
    }

    @Override
    public void type() {
        System.out.println("Inside Rectangle::type() method.");
    }

    @Override
    public String name() {
        return "Rectangle";
    }

    @Override
    public void draw() {
    }

    @Override
    public float price() {
        return 49.9f;
    }
}
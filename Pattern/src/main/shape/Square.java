package main.shape;

public class Square extends Shape implements Type {

    public Square() {
        edge = 4;
    }

    @Override
    public void type() {
        System.out.println("Inside Square::type() method.");
    }

    @Override
    public String name() {
        return "Square";
    }

    @Override
    public void draw() {

    }

    @Override
    public float price() {
        return 32.0f;
    }
}
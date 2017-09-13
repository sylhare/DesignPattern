package main.shape;

public class Square extends Shape implements Draw {

    public Square() {
        edge = 4;
    }

    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }

    @Override
    public String name() {
        return "Square";
    }

    @Override
    public float price() {
        return 32.0f;
    }

    @Override
    public void doodle() {

    }
}
package main.shape;

import pattern.structural.bridge.CircleAPI;

public class Circle extends Shape implements Draw {

    private int x, y, radius;

    public Circle() {
        edge = 0;
    }

    public Circle(int x, int y, int radius, CircleAPI circleAPI) {
        super(circleAPI);
        edge = 0;
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void doodle() {circleAPI.drawCircle(radius,x,y);
    }

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }

}
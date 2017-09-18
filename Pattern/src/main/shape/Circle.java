package main.shape;

import main.color.Color;
import pattern.behavioral.visitor.GeometricElements;
import pattern.behavioral.visitor.MathVisitor;
import pattern.structural.bridge.CircleAPI;

public class Circle extends Shape implements Draw, GeometricElements {
    private Color color;
    private int x=0, y=0, radius=50;

    public Circle(Color color) {
        this.color = color;
    }

    public Circle() {
        edge = 0;
    }

    // For Bridge Pattern
    public Circle(int x, int y, int radius, CircleAPI circleAPI) {
        super(circleAPI);
        edge = 0;
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void doodle() {
        circleAPI.drawCircle(radius, x, y);
    }

    // For Builder Pattern
    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Circle";
    }

    // For Factory Pattern
    @Override
    public void draw() {
        String details = "";

        if (color != null) {
            details = "[Color : " + color.name() + ", x : " + x + ", y :" + y + ", radius :" + radius;
        }

        System.out.print("Circle::draw()" + details + "\n");
    }

    // For Flywieght Pattern
    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return this.x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return this.y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    // For Visitor Pattern
    @Override
    public void accept(MathVisitor visitor) {
        visitor.visit(this);
    }
}
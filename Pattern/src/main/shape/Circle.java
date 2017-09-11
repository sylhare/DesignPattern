package main.shape;

public class Circle extends Shape implements Type {

    private int x, y, radius;

    public Circle() {}

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }

    @Override
    public void type() {
        System.out.println("Inside Circle::type() method.");
    }
}
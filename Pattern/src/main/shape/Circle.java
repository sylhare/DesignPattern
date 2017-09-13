package main.shape;

public class Circle extends Shape implements Type {

    private int x, y, radius;

    public Circle() {
        edge = 0;
    }

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        edge = 0;
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawAPI.drawCircle(radius,x,y);
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
    public void type() {
        System.out.println("Inside Circle::type() method.");
    }

}
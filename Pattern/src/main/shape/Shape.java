package main.shape;

/**
 * Created by sylhare in 2017.
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape() {}

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}

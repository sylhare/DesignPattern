package pattern.structural.facade;

import main.shape.*;

/**
 * Created by sylhare in 2017.
 */
public class DrawMaker {
    private Draw circle;
    private Draw rectangle;
    private Draw square;

    public DrawMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
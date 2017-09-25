package pattern.structural.flyweight;

import main.color.*;
import main.shape.Circle;
import pattern.creational.factory.ShapeFactory;

/**
 * Created by sylhare in 2017.
 */
public class FlyweightDemo {
    private static final Color colors[] = {new Blue(), new Green(), new Red()};

    public static void demo() {

        for (int i = 0; i < 5; ++i) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static Color getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}

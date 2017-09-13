package pattern.creational.factory;

import main.shape.Draw;

/**
 * Created by sylhare in 2017.
 * https://www.tutorialspoint.com/design_pattern/factory_pattern.htm
 */
public class FactoryDemo {

    public static void demo() {
        ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of Circle and call its draw method.
        Draw shape1 = shapeFactory.getShape("CIRCLE");

        //call draw method of Circle
        shape1.draw();

        //get an object of Rectangle and call its draw method.
        Draw shape2 = shapeFactory.getShape("RECTANGLE");

        //call draw method of Rectangle
        shape2.draw();

        //get an object of Square and call its draw method.
        Draw shape3 = shapeFactory.getShape("SQUARE");

        //call draw method of circle
        shape3.draw();
    }
}
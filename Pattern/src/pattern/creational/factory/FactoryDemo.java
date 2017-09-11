package pattern.creational.factory;

import main.shape.Type;

/**
 * Created by sylhare in 2017.
 * https://www.tutorialspoint.com/design_pattern/factory_pattern.htm
 */
public class FactoryDemo {

    public static void demo() {
        ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of Circle and call its type method.
        Type shape1 = shapeFactory.getShape("CIRCLE");

        //call type method of Circle
        shape1.type();

        //get an object of Rectangle and call its type method.
        Type shape2 = shapeFactory.getShape("RECTANGLE");

        //call type method of Rectangle
        shape2.type();

        //get an object of Square and call its type method.
        Type shape3 = shapeFactory.getShape("SQUARE");

        //call type method of circle
        shape3.type();
    }
}
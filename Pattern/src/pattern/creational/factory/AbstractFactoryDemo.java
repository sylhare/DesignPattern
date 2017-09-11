package pattern.creational.factory;

import main.color.Color;
import main.shape.Type;

/**
 * Created by sylhare in 2017.
 * https://www.tutorialspoint.com/design_pattern/abstract_factory_pattern.htm
 */
public class AbstractFactoryDemo {
    public static void demo() {

        //get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        Type shape1 = shapeFactory.getShape("CIRCLE");
        shape1.type();

        Type shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.type();

        Type shape3 = shapeFactory.getShape("SQUARE");
        shape3.type();

        //get color factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        //get an object of Color Red
        Color color1 = colorFactory.getColor("RED");

        //call fill method of Red
        color1.fill();

        //get an object of Color Green
        Color color2 = colorFactory.getColor("Green");

        //call fill method of Green
        color2.fill();

        //get an object of Color Blue
        Color color3 = colorFactory.getColor("BLUE");

        //call fill method of Color Blue
        color3.fill();
    }
}



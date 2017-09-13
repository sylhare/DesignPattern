package pattern.creational.factory;

import main.color.Paint;
import main.shape.Draw;

/**
 * Created by sylhare in 2017.
 * https://www.tutorialspoint.com/design_pattern/abstract_factory_pattern.htm
 */
public class AbstractFactoryDemo{

    public static void demo() {

        //get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        Draw shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Draw shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Draw shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();

        //get color factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        //get an object of Paint Red
        Paint paint1 = colorFactory.getColor("RED");

        //call fill method of Red
        paint1.fill();

        //get an object of Paint Green
        Paint paint2 = colorFactory.getColor("Green");

        //call fill method of Green
        paint2.fill();

        //get an object of Paint Blue
        Paint paint3 = colorFactory.getColor("BLUE");

        //call fill method of Paint Blue
        paint3.fill();
    }
}



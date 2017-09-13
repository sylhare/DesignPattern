package pattern.creational.factory;

import main.shape.*;
import main.color.*;

/**
 * Created by sylhare in 2017.
 *
 * Create Factory classes extending AbstractFactory to generate object of concrete class based on given information.
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Type getShape(String shapeType){
        return null;
    }

    @Override
    Paint getColor(String color) {

        if(color == null){
            return null;
        }

        if(color.equalsIgnoreCase("RED")){
            return new Red();

        }else if(color.equalsIgnoreCase("GREEN")){
            return new Green();

        }else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }

        return null;
    }
}
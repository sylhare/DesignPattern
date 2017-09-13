package pattern.creational.factory;

import main.color.Paint;
import main.shape.Circle;
import main.shape.Draw;
import main.shape.Rectangle;
import main.shape.Square;

/**
 * Create Factory classes extending AbstractFactory to generate object of concrete class based on given information.
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    Paint getColor(String color) {
        return null;
    }

    @Override
    /**
     * use getShape method to get object of draw shape
     */
    public Draw getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }
}
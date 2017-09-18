package pattern.creational.factory;

import main.color.Color;
import main.color.Paint;
import main.shape.Circle;
import main.shape.Draw;
import main.shape.Rectangle;
import main.shape.Square;

import java.util.HashMap;

/**
 * Create Factory classes extending AbstractFactory to generate object of concrete class based on given information.
 */
public class ShapeFactory extends AbstractFactory {
    private static final HashMap<String, Draw> circleMap = new HashMap(); //flyweight Pattern

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

    // For Flyweight Pattern
    public static Draw getCircle(Color color) {
        Circle circle = (Circle)circleMap.get(color.name());

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color.name(), circle);
            System.out.println("Creating circle of color : " + color.name());
        }
        return circle;
    }
}
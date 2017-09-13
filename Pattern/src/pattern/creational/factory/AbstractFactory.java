package pattern.creational.factory;

import main.color.Paint;
import main.shape.Type;

/**
 * Created by sylhare in 2017.
 */
public abstract class AbstractFactory {
    abstract Paint getColor(String color);
    abstract Type getShape(String shape) ;
}
package pattern.creational.factory;

import main.color.Color;
import main.shape.Type;

/**
 * Created by sylhare in 2017.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Type getShape(String shape) ;
}
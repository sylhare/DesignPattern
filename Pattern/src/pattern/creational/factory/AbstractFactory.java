package pattern.creational.factory;

import main.color.Paint;
import main.shape.Draw;

/**
 * Created by sylhare in 2017.
 */
public abstract class AbstractFactory {
    abstract Paint getColor(String color);
    abstract Draw getShape(String shape) ;
}
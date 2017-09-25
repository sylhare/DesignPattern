package pattern.structural.decorator;

import main.shape.Circle;
import main.shape.Rectangle;
import main.shape.Draw;

/**
 * Created by sylhare in 2017.
 * https://www.tutorialspoint.com/design_pattern/decorator_pattern.htm
 */
public class DecoratorDemo {

    public static void demo(){
        Draw circle = new Circle();

        Draw decoCircle = new EuclideanDrawDecorator(new Circle());
        Draw decoRectangle = new BorderDecorator(new Rectangle());

        System.out.println("Circle - normal draw");
        circle.draw();

        System.out.println("\nCircle - decorated");
        decoCircle.draw();

        System.out.println("\nRectangle - decorated");
        decoRectangle.draw();
    }

}

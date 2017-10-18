package pattern.behavioral.template;

/**
 * Created by sylhare in 2017.
 */
public class TemplateDemo {

    public static void main(String args[]) {
        Vehicle car = new Car();
        car.run();
        System.out.println();

        Vehicle plane = new Plane();
        plane.run();
    }
}

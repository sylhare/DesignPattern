package pattern.behavioral.visitor;

/**
 * Created by sylhare in 2017.
 * https://www.tutorialspoint.com/design_pattern/visitor_pattern.htm
 */
public class VisitorDemo {

    public static void demo() {
        GeometricElements plan = new Plan();
        plan.accept(new Mathematician());
    }

}

package pattern.behavioral.visitor;

import main.shape.Circle;
import main.shape.Rectangle;
import main.shape.Square;

/**
 * Created by sylhare in 2017.
 */
public class Plan implements GeometricElements {
    private String name = "plan";
    GeometricElements[] plan;

    public Plan(){
        plan = new GeometricElements[] {new Square(), new Rectangle(), new Circle()};
    }

    public String getName(){
        return this.name;
    }

    @Override
    public void accept(MathVisitor visitor) {
        for (int i = 0; i < plan.length; i++) {
            plan[i].accept(visitor);
        }
        visitor.visit(this);
    }
}

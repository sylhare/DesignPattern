package pattern.behavioral.visitor;

import main.shape.Circle;
import main.shape.Rectangle;
import main.shape.Square;

/**
 * Created by sylhare in 2017.
 * Implementation of the MathVisitor interface
 */
public class Mathematician implements MathVisitor{
    @Override
    public void visit(Plan plan) {
        System.out.println("Displaying the " + plan.getName());
    }

    @Override
    public void visit(Square square) {
        System.out.println("Displaying the " + square.name() + " and number of edge : " + square.getEdge());
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("Displaying the " + rectangle.name() + " and number of edge : " + rectangle.getEdge());
    }

    @Override
    public void visit(Circle circle) {
        String coordinates = "( " + circle.getX() + ", " + circle.getY() + " ) and radius : " + circle.getRadius();
        System.out.println("Displaying the " + circle.name() + "of coordinate : " + coordinates);

    }
}

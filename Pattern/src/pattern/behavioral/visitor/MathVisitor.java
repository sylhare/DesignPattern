package pattern.behavioral.visitor;

import main.shape.*;

/**
 * Created by sylhare in 2017.
 */
public interface MathVisitor {
    void visit(Plan plan);
    void visit(Square square);
    void visit(Rectangle rectangle);
    void visit(Circle circle);
}

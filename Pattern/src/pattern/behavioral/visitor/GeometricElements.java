package pattern.behavioral.visitor;

/**
 * Created by sylhare in 2017.
 */
public interface GeometricElements {
    void accept(MathVisitor visitor);
}

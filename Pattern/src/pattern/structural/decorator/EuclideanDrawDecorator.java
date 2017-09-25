package pattern.structural.decorator;

import main.shape.Draw;

/**
 * Created by sylhare in 2017.
 */
public class EuclideanDrawDecorator extends DrawDecorator {

    public EuclideanDrawDecorator(Draw decoratedDraw) {
        super(decoratedDraw);
    }

    @Override
    public void draw(){
        decoratedDraw.draw();
        setEuclideanSpace();
    }

    private void setEuclideanSpace(){
        System.out.println("Space : Euclidean");
    }
}

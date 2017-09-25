package pattern.structural.decorator;

import main.shape.Draw;

/**
 * Created by sylhare in 2017.
 */
public abstract class DrawDecorator implements Draw {
    protected Draw decoratedDraw;

    public DrawDecorator(Draw decoratedDraw){
        this.decoratedDraw = decoratedDraw;
    }

    @Override
    public void draw(){
        decoratedDraw.draw();
    }
}

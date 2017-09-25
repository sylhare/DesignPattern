package pattern.structural.decorator;

import main.shape.Draw;

/**
 * Created by sylhare in 2017.
 */
public class BorderDecorator extends DrawDecorator {

    public BorderDecorator(Draw decoratedDraw) {
        super(decoratedDraw);
    }

    @Override
    public void draw() {
        decoratedDraw.draw();
        setBorder();
    }

    private void setBorder() {
        System.out.println("Border : Black");
    }
}
package pattern.creational.builder;

import main.color.*;
import main.shape.*;

/**
 * Created by sylhare in 2017.
 */
public class ToyBuilder {
    public Toy createColorfulToy(){
        Toy toy = new Toy();
        toy.addItem(new Blue());
        toy.addItem(new Red());
        toy.addItem(new Green());
        toy.addItem(new Circle());
        return toy;
    }

    public Toy createShapyToy (){
        Toy toy = new Toy();
        toy.addItem(new Blue());
        toy.addItem(new Square());
        toy.addItem(new Rectangle());
        toy.addItem(new Circle());
        return toy;
    }
}


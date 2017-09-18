package pattern.creational.Prototype;

import main.shape.Shape;

/**
 * Created by sylhare in 2017.
 */
public class PrototypeDemo {
    public static void demo(){
        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape("1");
        shapeString(clonedShape);

        Shape clonedShape2 = ShapeCache.getShape("2");
        shapeString(clonedShape2);

        Shape clonedShape3 = ShapeCache.getShape("3");
        shapeString(clonedShape3);

    }

    public static void shapeString(Shape s){
        System.out.println("Shape : " + s.name() + " - Number of edge : " + s.getEdge());
    }
}

package pattern.creational.factory;

/**
 * Created by sylhare in 2017.
 * Create a Factory generator/producer class to get factories by passing an information such as Type or Color
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){

        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();

        }else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }

        return null;
    }
}
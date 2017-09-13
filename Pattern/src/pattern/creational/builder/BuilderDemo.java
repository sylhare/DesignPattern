package pattern.creational.builder;

/**
 * Created by sylhare in 2017.
 * https://www.tutorialspoint.com/design_pattern/builder_pattern.htm
 */
public class BuilderDemo{

    public static void demo() {
        ToyBuilder toyBuilder = new ToyBuilder();

        Toy colorful = toyBuilder.createColorfulToy();
        System.out.println("Colorful Toy");
        colorful.showItems();
        System.out.println("Total Cost: " + colorful.getCost());

        Toy shapy = toyBuilder.createShapyToy();
        System.out.println("\n\nShapy Toy");
        shapy.showItems();
        System.out.println("Total Cost: " + shapy.getCost());
    }
}



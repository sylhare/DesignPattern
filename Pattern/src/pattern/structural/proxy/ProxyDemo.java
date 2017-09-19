package pattern.structural.proxy;

/**
 * Created by sylhare in 2017.
 * https://www.tutorialspoint.com/design_pattern/proxy_pattern.htm
 */
public class ProxyDemo {
    public static void demo() {
        Display display = new ProxyDisplay("image.jpg");

        //image will be loaded from disk
        display.display();
        System.out.println("");

        //image will not be loaded from disk
        display.display();
    }
}

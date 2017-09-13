package pattern.structural.bridge;

import main.shape.*;

/**
 * Created by sylhare in 2017.
 * https://www.tutorialspoint.com/design_pattern/bridge_pattern.htm
 */
public class BridgeDemo {
    public static void demo() {
        Shape ball = new Circle(100,100, 10, new Ball());
        Shape bubble = new Circle(100,100, 10, new Bubble());

        ball.doodle();
        bubble.doodle();
    }
}

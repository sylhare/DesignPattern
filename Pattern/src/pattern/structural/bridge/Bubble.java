package pattern.structural.bridge;

import main.shape.DrawAPI;

/**
 * Created by sylhare in 2017
 *
 * concrete bridge implementer classes implementing the DrawAPI interface.
 */
public class Bubble implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle [ style: Bubble, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}

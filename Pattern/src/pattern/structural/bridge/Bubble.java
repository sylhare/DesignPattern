package pattern.structural.bridge;

/**
 * Created by sylhare in 2017
 *
 * concrete bridge implementer classes implementing the CircleAPI interface.
 */
public class Bubble implements CircleAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle [ style: Bubble, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}

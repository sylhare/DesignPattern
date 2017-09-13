package pattern.structural.bridge;

/**
 * Created by sylhare in 2017
 *
 * concrete bridge implementer classes implementing the CircleAPI interface.
 */
public class Ball implements CircleAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle [ style: Ball, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}

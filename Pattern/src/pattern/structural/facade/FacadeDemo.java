package pattern.structural.facade;

/**
 * Created by sylhare in 2017.
 * https://www.tutorialspoint.com/design_pattern/facade_pattern.htm
 */
public class FacadeDemo {
    public static void demo(){
        DrawMaker drawMaker = new DrawMaker();

        drawMaker.drawCircle();
        drawMaker.drawRectangle();
        drawMaker.drawSquare();
    }
}

package pattern.behavioral.strategy;

import main.utils.*;

/**
 * Created by sylhare in 2017.
 * https://www.tutorialspoint.com/design_pattern/strategy_pattern.htm
 */
public class StrategyDemo {

    public static void demo() {
        Context context = new Context(new Addition());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new Substraction());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new Multiplication());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
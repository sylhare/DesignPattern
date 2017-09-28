package pattern.behavioral.command;

/**
 * Created by sylhare in 2017.
 * https://www.tutorialspoint.com/design_pattern/command_pattern.htm
 */
public class CommandDemo {
    public static void demo() {
        Stock abcStock = new Stock();

        Buy buyStockOrder = new Buy(abcStock);
        Sell sellStockOrder = new Sell(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}

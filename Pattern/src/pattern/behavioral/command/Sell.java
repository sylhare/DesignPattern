package pattern.behavioral.command;

/**
 * Created by sylhare in 2017.
 */
public class Sell implements Order {
    private Stock abcStock;

    public Sell(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
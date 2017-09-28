package pattern.behavioral.command;

/**
 * Created by sylhare in 2017.
 */
public class Buy implements Order {
    private Stock abcStock;

    public Buy(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
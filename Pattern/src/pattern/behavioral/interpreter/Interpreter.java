package pattern.behavioral.interpreter;

/**
 * Created by sylhare in 2017.
 */
public class Interpreter implements Expression{
    private String data;

    public Interpreter(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {

        if(context.contains(data)){
            return true;
        }
        return false;
    }
}

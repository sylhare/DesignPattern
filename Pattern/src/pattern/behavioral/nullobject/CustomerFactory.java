package pattern.behavioral.nullobject;

import main.people.User;

/**
 * Created by sylhare in 2017.
 */
public class CustomerFactory {

    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name){

        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)){
                return new User(name);
            }
        }
        return new NullCustomer();
    }
}
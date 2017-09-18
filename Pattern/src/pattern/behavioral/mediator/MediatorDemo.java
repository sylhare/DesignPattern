package pattern.behavioral.mediator;

import main.people.User;

/**
 * Created by sylhare in 2017.
 * https://www.tutorialspoint.com/design_pattern/mediator_pattern.htm
 */
public class MediatorDemo {
    public static void demo() {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}

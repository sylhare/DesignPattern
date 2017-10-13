package pattern.behavioral.observer;

import main.people.Subject;

/**
 * Created by sylhare in 2017.
 */
public class ObserverDemo {

    public static void demo() {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState("15");
        System.out.println("Second state change: 10");
        subject.setState("10");

    }
}

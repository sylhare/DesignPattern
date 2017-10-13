package pattern.behavioral.observer;

import main.people.Subject;

/**
 * Created by sylhare in 2017.
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " + toBinary(subject.getState()));
    }

    public String toBinary(String number) {
        return Integer.toBinaryString(Integer.valueOf(number));
    }
}

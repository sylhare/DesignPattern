package pattern.behavioral.observer;

import main.people.Subject;

/**
 * Created by sylhare in 2017.
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: " + toHexa(subject.getState()));
    }

    public String toHexa(String number) {
        return Integer.toHexString(Integer.valueOf(number)).toUpperCase();
    }
}

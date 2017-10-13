package pattern.behavioral.observer;

import main.people.Subject;

/**
 * Created by sylhare in 2017.
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: " + toOctal(subject.getState()));
    }

    public String toOctal(String number) {
        return Integer.toOctalString(Integer.valueOf(number));
    }
}

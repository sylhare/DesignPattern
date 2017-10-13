package pattern.behavioral.observer;

import main.people.Subject;

/**
 * Created by sylhare in 2017.
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}

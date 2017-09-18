package pattern.behavioral.memento;

import main.people.Subject;

/**
 * Created by sylhare in 2017.
 * https://www.tutorialspoint.com/design_pattern/memento_pattern.htm
 */
public class MementoDemo {
    public static void demo() {

        Subject subject = new Subject();
        Memory memory = new Memory();

        subject.setState("State #1");
        subject.setState("State #2");
        memory.add(subject.saveStateMemento());

        subject.setState("State #3");
        memory.add(subject.saveStateMemento());

        subject.setState("State #4");
        System.out.println("Current State: " + subject.getState());

        subject.getStateMemento(memory.get(0));
        System.out.println("First saved State: " + subject.getState());
        subject.getStateMemento(memory.get(1));
        System.out.println("Second saved State: " + subject.getState());
    }
}

package main.people;

import pattern.behavioral.memento.Memento;
import pattern.behavioral.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sylhare in 2017.
 */
public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private String state;


    public void setState(String state){
        this.state = state;
        notifyAllObservers();
    }

    public String getState(){
        return state;
    }

    // Memento
    public Memento saveStateMemento(){
        return new Memento(state);
    }

    public void getStateMemento(Memento memento){
        this.state = memento.getState();
    }

    // Observer
    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}

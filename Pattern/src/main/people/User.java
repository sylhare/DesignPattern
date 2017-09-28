package main.people;

import pattern.behavioral.mediator.ChatRoom;
import pattern.behavioral.nullobject.AbstractCustomer;

/**
 * Created by sylhare in 2017.
 */
public class User extends AbstractCustomer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    // Mediator
    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }

    // Null Object
    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNil() {
        return false;
    }
}

package pattern.behavioral.mediator;

import main.people.User;

import java.util.Date;
/**
 * Created by sylhare in 2017.
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}

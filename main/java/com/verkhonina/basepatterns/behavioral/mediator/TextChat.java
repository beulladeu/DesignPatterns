package main.java.com.verkhonina.basepatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class TextChat implements Chat {

    private User admin;
    private List<User> users = new ArrayList<>();

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        admin.getMessage(message);
        for (User u: users) {
            u.getMessage(message);
        }
    }
}

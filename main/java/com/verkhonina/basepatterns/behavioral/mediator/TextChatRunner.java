package main.java.com.verkhonina.basepatterns.behavioral.mediator;

public class TextChatRunner {
    public static void main(String[] args) {
        TextChat chat = new TextChat();

        User admin = new Admin(chat);
        User user1 = new SimpleUser(chat, "user1");
        User user2 = new SimpleUser(chat, "user2");


        chat.setAdmin(admin);
        chat.addUser(user1);
        chat.addUser(user2);

        user1.sendMessage("Hello!!!");
        admin.sendMessage("Hi! I am admin.");
        user2.sendMessage("Fine");
    }
}

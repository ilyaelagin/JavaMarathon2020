package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");

        user1.sendMessage(user2, "Hello, user2!");
        user1.sendMessage(user2, "How are you?");
        user2.sendMessage(user1, "Hello, user1!");
        user2.sendMessage(user1, "I am fine, thanks!");
        user2.sendMessage(user1, "How are you, user1?");
        user3.sendMessage(user1, "Hello, user1!");
        user3.sendMessage(user1, "How are you?");
        user3.sendMessage(user1, "And where are you from, user1?");
        user1.sendMessage(user3, "Hello, user3!");
        user1.sendMessage(user3, "Good, thanks.");
        user1.sendMessage(user3, "I'm from NY. And you?");
        user3.sendMessage(user1, "I'm from NJ.");

        MessageDatabase.showDialog(user1, user3);
    }
}

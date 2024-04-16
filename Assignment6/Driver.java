package Assignment6;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();

        // create users
        System.out.println("-------------------------USERS REGISTRATION--------------------------------");
        User ruchitha = new User("Ruchitha", chatServer);
        User lahari = new User("Lahari", chatServer);
        User sam = new User("Sam", chatServer);

        // register users
        ruchitha.registerUser(ruchitha);
        lahari.registerUser(lahari);
        sam.registerUser(sam);

        System.out.println("-------------------------SENDING MESSAGES BETWEEN USERS--------------------------------");

        // Send messages
        ruchitha.send(new ArrayList<User>(Arrays.asList(lahari,sam)), "Hello!");
        lahari.send(new ArrayList<User>(Arrays.asList(ruchitha)), "Hi Ruchitha, how are you?");
        sam.send(new ArrayList<User>(Arrays.asList(ruchitha)), "Hey Ruchitha, wanna go to shopping?");
        ruchitha.send(new ArrayList<User>(Arrays.asList(sam)), "Sure Sam, where do you want to go?");

        // Undo last message
        System.out.println("-------------------------UNDO LAST MESSAGE--------------------------------");
        ruchitha.undo(ruchitha);

        // Block messages from specific user
        System.out.println("-------------------------BLOCKING USERS--------------------------------");
        lahari.block(ruchitha);
        // Send messages again
        ruchitha.send(new ArrayList<User>(Arrays.asList(lahari)), "Please can you unblock me, Lahari?");

        // Print chat history
        System.out.println("-------------------------CHAT HISTORY--------------------------------");
        System.out.println("Chat history for Ruchitha:");
        ruchitha.getChatHistory();

        System.out.println("Chat history for Lahari:");
        lahari.getChatHistory();

        System.out.println("Chat history for Sam:");
        sam.getChatHistory();

        System.out.println("-------------------------THE END--------------------------------");
    }
}
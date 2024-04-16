package Assignment6;
import java.util.*;

public class User implements IterableByUser{
    private String name;
    private ChatServer server;
    private ChatHistory chatHistory;

    public User(String name, ChatServer server) {
        this.name = name;
        this.server = server;
        this.chatHistory = new ChatHistory();
    }

    public String send(List<User> recipients, String content) {
        User sender = this;
        Message message = new Message(sender, recipients, content);
        chatHistory.addMessage(message);
        server.sendMessage(message.getSender(),message.getRecipients(),message.getContent());
        return content;
    }

    public void undo(User user) {
        Message lastMessage = chatHistory.getLastMessage();
        if (lastMessage != null) {
            server.undoLastMessage(user, chatHistory);
        }
    }

    public void block(User user) {
        server.blockUser(this, user);
    }

    public String getName() {
        return name;
    }
    public void registerUser(User user){
        server.registerUser(user);
        System.out.println(user.getName() + " Registered!");
    }

    public void getChatHistory() {
        chatHistory.getChatHistory();
    }

    private List<Message> messages2;
    public User(String name) {
        this.name = name;
        this.messages2 = new ArrayList<>();
    }


    public List<Message> getMessages() {
        return this.messages2;
    }
    @Override
    public Iterator iterator(User userToSearchWith) {
        return new SearchMessagesByUser(this.getMessages(), userToSearchWith);
    }
}